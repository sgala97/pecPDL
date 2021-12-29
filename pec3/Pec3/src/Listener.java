import java.util.HashMap;
import java.util.Stack;

public class Listener extends pseint_grammarBaseListener {
    TablaDeSimbolos tablaDeSimbolos;
    //Constructor que recibe tabla de símbolos
    public Listener(TablaDeSimbolos tablaDeSimbolos)
    {
        this.tablaDeSimbolos = tablaDeSimbolos;
    }

    @Override
    public void enterAlgoritmo(pseint_grammar.AlgoritmoContext ctx) {
        super.enterAlgoritmo(ctx);
        tablaDeSimbolos.setRaizActual(new BloqueRaiz());
        tablaDeSimbolos.setPrograma(tablaDeSimbolos.getRaizActual());
    }

    @Override
    public void exitAlgoritmo(pseint_grammar.AlgoritmoContext ctx) {
        super.exitAlgoritmo(ctx);
        tablaDeSimbolos.getRaizActual().sumarLineasEfectivas(2);
        tablaDeSimbolos.getRaizActual().setPuntuacionesHijos();
    }

    @Override
    public void enterFuncion(pseint_grammar.FuncionContext ctx) {
        super.enterFuncion(ctx);
        tablaDeSimbolos.setRaizActual(new BloqueRaiz());
        tablaDeSimbolos.getRaizActual().sumarPuntuacion((ctx.NOMBRE().size()-2)*2);
        tablaDeSimbolos.getRaizActual().sumarParametros(ctx.NOMBRE().size()-2);
        tablaDeSimbolos.addFuncion(ctx.NOMBRE().get(1).getText(), tablaDeSimbolos.getRaizActual());
    }

    @Override
    public void exitFuncion(pseint_grammar.FuncionContext ctx) {
        super.exitFuncion(ctx);
        //Sumar linea inicio funcion y fin funcion
        tablaDeSimbolos.getRaizActual().sumarLineasEfectivas(2);
        tablaDeSimbolos.getRaizActual().setPuntuacionesHijos();
    }


    @Override
    public void enterBloqueEstandar(pseint_grammar.BloqueEstandarContext ctx) {
        super.enterBloqueEstandar(ctx);
        //Crea un bloque estandar y lo introduce en la raiz si la pila está vacía
        //o en la cabeza de la pila
        Bloque bloque = new Bloque(TipoBloque.ESTANDAR);
        if (tablaDeSimbolos.isEmpty())
        {
            tablaDeSimbolos.getRaizActual().addHijo(bloque);
        }
        else
        {
            tablaDeSimbolos.peek().addHijo(bloque);
        }
        tablaDeSimbolos.push(bloque);
    }

    @Override
    public void exitBloqueEstandar(pseint_grammar.BloqueEstandarContext ctx) {
        super.exitBloqueEstandar(ctx);
        tablaDeSimbolos.pop();
    }

    @Override
    public void enterDefinicion(pseint_grammar.DefinicionContext ctx) {
        super.enterDefinicion(ctx);
        tablaDeSimbolos.getRaizActual().sumarLineasEfectivas(1);
        tablaDeSimbolos.getRaizActual().sumarVariables(1);
        tablaDeSimbolos.peek().sumarPuntuacion(1);
    }

    @Override
    public void enterAsignacion(pseint_grammar.AsignacionContext ctx) {
        super.enterAsignacion(ctx);
        tablaDeSimbolos.getRaizActual().sumarLineasEfectivas(1);
    }


    @Override
    public void enterLeer(pseint_grammar.LeerContext ctx) {
        super.enterLeer(ctx);
        tablaDeSimbolos.getRaizActual().sumarLineasEfectivas(1);
    }

    @Override
    public void enterEscribir(pseint_grammar.EscribirContext ctx) {
        super.enterEscribir(ctx);
        tablaDeSimbolos.getRaizActual().sumarLineasEfectivas(1);
    }

    @Override
    public void enterBloquesi(pseint_grammar.BloquesiContext ctx) {
        super.enterBloquesi(ctx);
        Bloque si = new Bloque(TipoBloque.IF);
        if (tablaDeSimbolos.isEmpty())
        {
            tablaDeSimbolos.getRaizActual().addHijo(si);
        }
        else
        {
            tablaDeSimbolos.peek().addHijo(si);
        }
        tablaDeSimbolos.push(si);
        tablaDeSimbolos.getRaizActual().sumarLineasEfectivas(2);
    }

    @Override
    public void exitBloquesi(pseint_grammar.BloquesiContext ctx) {
        super.exitBloquesi(ctx);
        tablaDeSimbolos.peek().setPuntuacionDeHijos();
        tablaDeSimbolos.pop();
    }

    @Override
    public void enterBloqueno(pseint_grammar.BloquenoContext ctx) {
        super.enterBloqueno(ctx);
        Bloque no = new Bloque(TipoBloque.ELSE);
        if (tablaDeSimbolos.isEmpty())
        {
            tablaDeSimbolos.getRaizActual().addHijo(no);
        }
        else
        {
            tablaDeSimbolos.peek().addHijo(no);
        }
        tablaDeSimbolos.push(no);
        tablaDeSimbolos.getRaizActual().sumarLineasEfectivas(1);
    }

    @Override
    public void exitBloqueno(pseint_grammar.BloquenoContext ctx) {
        super.exitBloqueno(ctx);
        tablaDeSimbolos.peek().setPuntuacionDeHijos();
        tablaDeSimbolos.pop();
    }

    @Override
    public void enterSegun(pseint_grammar.SegunContext ctx) {
        super.enterSegun(ctx);
        tablaDeSimbolos.getRaizActual().sumarLineasEfectivas(2);
    }
    @Override
    public void enterCaso(pseint_grammar.CasoContext ctx) {
        super.enterCaso(ctx);
        Bloque caso = new Bloque(TipoBloque.CASO);
        if (tablaDeSimbolos.isEmpty())
        {
            tablaDeSimbolos.getRaizActual().addHijo(caso);
        }
        else
        {
            tablaDeSimbolos.peek().addHijo(caso);
        }
        tablaDeSimbolos.push(caso);
        tablaDeSimbolos.getRaizActual().sumarLineasEfectivas(1);
    }

    @Override
    public void exitCaso(pseint_grammar.CasoContext ctx) {
        super.exitCaso(ctx);
        tablaDeSimbolos.peek().setPuntuacionDeHijos();
        tablaDeSimbolos.pop();
    }

    @Override
    public void enterDeotromodo(pseint_grammar.DeotromodoContext ctx) {
        super.enterDeotromodo(ctx);
        Bloque dom = new Bloque(TipoBloque.DEOTROMODO);
        if (tablaDeSimbolos.isEmpty())
        {
            tablaDeSimbolos.getRaizActual().addHijo(dom);
        }
        else
        {
            tablaDeSimbolos.peek().addHijo(dom);
        }
        tablaDeSimbolos.push(dom);
        tablaDeSimbolos.getRaizActual().sumarLineasEfectivas(1);
    }

    @Override
    public void exitDeotromodo(pseint_grammar.DeotromodoContext ctx) {
        super.exitDeotromodo(ctx);
        tablaDeSimbolos.peek().setPuntuacionDeHijos();
        tablaDeSimbolos.pop();
    }


    @Override
    public void enterMientras(pseint_grammar.MientrasContext ctx) {
        super.enterMientras(ctx);
        Bloque mientras = new Bloque(TipoBloque.WHILE);
        if (tablaDeSimbolos.isEmpty())
        {
            tablaDeSimbolos.getRaizActual().addHijo(mientras);
        }
        else
        {
            tablaDeSimbolos.peek().addHijo(mientras);
        }
        tablaDeSimbolos.push(mientras);
        tablaDeSimbolos.getRaizActual().sumarLineasEfectivas(2);
    }

    @Override
    public void exitMientras(pseint_grammar.MientrasContext ctx) {
        super.exitMientras(ctx);
        tablaDeSimbolos.peek().setPuntuacionDeHijos();
        tablaDeSimbolos.pop();
    }

    @Override
    public void enterRepetir(pseint_grammar.RepetirContext ctx) {
        super.enterRepetir(ctx);
        Bloque repetir = new Bloque(TipoBloque.DOWHILE);
        if (tablaDeSimbolos.isEmpty())
        {
            tablaDeSimbolos.getRaizActual().addHijo(repetir);
        }
        else
        {
            tablaDeSimbolos.peek().addHijo(repetir);
        }
        tablaDeSimbolos.push(repetir);
        tablaDeSimbolos.getRaizActual().sumarLineasEfectivas(2);
    }

    @Override
    public void exitRepetir(pseint_grammar.RepetirContext ctx) {
        super.exitRepetir(ctx);
        tablaDeSimbolos.peek().setPuntuacionDeHijos();
        tablaDeSimbolos.pop();
    }

    @Override
    public void enterPara(pseint_grammar.ParaContext ctx) {
        super.enterPara(ctx);
        Bloque para = new Bloque(TipoBloque.FOR);
        if (tablaDeSimbolos.isEmpty())
        {
            tablaDeSimbolos.getRaizActual().addHijo(para);
        }
        else
        {
            tablaDeSimbolos.peek().addHijo(para);
        }
        tablaDeSimbolos.push(para);
        tablaDeSimbolos.getRaizActual().sumarLineasEfectivas(2);
        //Variable que recorre el bucle
        tablaDeSimbolos.getRaizActual().sumarVariables(1);
    }

    @Override
    public void exitPara(pseint_grammar.ParaContext ctx) {
        super.exitPara(ctx);
        tablaDeSimbolos.peek().setPuntuacionDeHijos();
        tablaDeSimbolos.pop();
    }

    @Override
    public void enterUsofuncion(pseint_grammar.UsofuncionContext ctx) {

        super.enterUsofuncion(ctx);
        tablaDeSimbolos.getRaizActual().sumarLlamadas(1);
        tablaDeSimbolos.getRaizActual().addFuncionLlamada(ctx.NOMBRE().getText());
        tablaDeSimbolos.peek().sumarPuntuacion(2+ctx.operacion().size());
    }

    @Override
    public void enterConOperadores(pseint_grammar.ConOperadoresContext ctx) {
        super.enterConOperadores(ctx);
        if(tablaDeSimbolos.isEmpty())
        {
            tablaDeSimbolos.getRaizActual().sumarPuntuacion(1);
        }
        else
        {
            tablaDeSimbolos.peek().sumarPuntuacion(1);
        }
    }

    @Override
    public void exitPseint(pseint_grammar.PseintContext ctx) {
        super.exitPseint(ctx);
        tablaDeSimbolos.sumarPuntuacion(tablaDeSimbolos.getPrograma().getPuntuacion());
        for(BloqueRaiz funcion: tablaDeSimbolos.getFunciones()){
            tablaDeSimbolos.sumarPuntuacion(funcion.getPuntuacion());
        }
    }
}