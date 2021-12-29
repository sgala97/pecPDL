import java.util.HashMap;
import java.util.Stack;

public class Listener extends pseint_grammarBaseListener {
    private HashMap<String, BloqueRaiz> programa = new HashMap<>();
    private int puntuacionPrograma = 0;
    private BloqueRaiz raizActual;
    private Stack<Bloque> pilaActual = new Stack<>();

    @Override
    public void enterAlgoritmo(pseint_grammar.AlgoritmoContext ctx) {
        super.enterAlgoritmo(ctx);
        raizActual = new BloqueRaiz();
        pilaActual = new Stack<>();
        programa.put(ctx.NOMBRE().getText(), raizActual);
    }

    @Override
    public void exitAlgoritmo(pseint_grammar.AlgoritmoContext ctx) {
        super.exitAlgoritmo(ctx);
        pilaActual.pop();
        raizActual.sumarLineasEfectivas(1);
    }

    @Override
    public void enterFuncion(pseint_grammar.FuncionContext ctx) {
        super.enterFuncion(ctx);
        raizActual = new BloqueRaiz();
        pilaActual = new Stack<>();
        raizActual.sumarPuntuacion((ctx.NOMBRE().size()-2)*2);
        raizActual.sumarParametros(ctx.NOMBRE().size()-2);
        programa.put(ctx.NOMBRE().get(1).getText(), raizActual);
    }

    @Override
    public void exitFuncion(pseint_grammar.FuncionContext ctx) {
        super.exitFuncion(ctx);
        pilaActual.pop();
        raizActual.sumarLineasEfectivas(1);
    }

    @Override
    public void enterBloqueEstandar(pseint_grammar.BloqueEstandarContext ctx) {
        super.enterBloqueEstandar(ctx);
        Bloque bloque = new Bloque(TipoBloque.ESTANDAR);
        if (pilaActual.isEmpty())
        {
            pilaActual.push(bloque);
            raizActual.addHijo(bloque);
        }
        else if(pilaActual.peek().getTipo() != TipoBloque.ESTANDAR)
        {
            pilaActual.peek().addHijo(bloque);
            pilaActual.push(bloque);
        }
    }

    @Override
    public void exitBloqueEstandar(pseint_grammar.BloqueEstandarContext ctx) {
        super.exitBloqueEstandar(ctx);
        if(!ctx.getParent().children.get(ctx.getParent().children.indexOf(ctx) + 1).getText().equals("bloqueEstandar"))
        {
            pilaActual.pop();
        }
    }

    @Override
    public void enterDefinicion(pseint_grammar.DefinicionContext ctx) {
        super.enterDefinicion(ctx);
        raizActual.sumarPuntuacion(1);
    }

    @Override
    public void exitDefinicion(pseint_grammar.DefinicionContext ctx) {
        super.exitDefinicion(ctx);
        raizActual.sumarLineasEfectivas(1);

    }

    @Override
    public void exitAsignacion(pseint_grammar.AsignacionContext ctx) {
        super.exitAsignacion(ctx);
        raizActual.sumarLineasEfectivas(1);
    }


    @Override
    public void exitLeer(pseint_grammar.LeerContext ctx) {
        super.exitLeer(ctx);
        raizActual.sumarLineasEfectivas(1);
        pilaActual.pop();
    }

    @Override
    public void exitEscribir(pseint_grammar.EscribirContext ctx) {
        super.exitEscribir(ctx);
    }

    @Override
    public void enterBloquesi(pseint_grammar.BloquesiContext ctx) {
        super.enterBloquesi(ctx);
        Bloque si = new Bloque(TipoBloque.IF);
        if (pilaActual.isEmpty())
        {
            raizActual.addHijo(si);
        }
        else
        {
            pilaActual.peek().addHijo(si);
        }
        pilaActual.push(si);
    }

    @Override
    public void exitBloquesi(pseint_grammar.BloquesiContext ctx) {
        super.exitBloquesi(ctx);
        pilaActual.pop();
        raizActual.sumarLineasEfectivas(1);
    }

    @Override
    public void enterBloqueno(pseint_grammar.BloquenoContext ctx) {
        super.enterBloqueno(ctx);
        Bloque no = new Bloque(TipoBloque.ELSE);
        if (pilaActual.isEmpty())
        {
            raizActual.addHijo(no);
        }
        else
        {
            pilaActual.peek().addHijo(no);
        }
        pilaActual.push(no);
    }

    @Override
    public void exitBloqueno(pseint_grammar.BloquenoContext ctx) {
        super.exitBloqueno(ctx);
        raizActual.sumarLineasEfectivas(1);
        pilaActual.pop();
    }

    @Override
    public void enterSegun(pseint_grammar.SegunContext ctx) {
        super.enterSegun(ctx);
    }

    @Override
    public void exitSegun(pseint_grammar.SegunContext ctx) {
        super.exitSegun(ctx);
        raizActual.sumarLineasEfectivas(1);
        pilaActual.pop();
    }

    @Override
    public void enterCaso(pseint_grammar.CasoContext ctx) {
        super.enterCaso(ctx);
        Bloque caso = new Bloque(TipoBloque.CASO);
        if (pilaActual.isEmpty())
        {
            raizActual.addHijo(caso);
        }
        else
        {
            pilaActual.peek().addHijo(caso);
        }
        pilaActual.push(caso);
    }

    @Override
    public void exitCaso(pseint_grammar.CasoContext ctx) {
        super.exitCaso(ctx);
        pilaActual.pop();
    }

    @Override
    public void enterDeotromodo(pseint_grammar.DeotromodoContext ctx) {
        super.enterDeotromodo(ctx);
        Bloque dom = new Bloque(TipoBloque.CASO);
        if (pilaActual.isEmpty())
        {
            raizActual.addHijo(dom);
        }
        else
        {
            pilaActual.peek().addHijo(dom);
        }
        pilaActual.push(dom);
    }

    @Override
    public void exitDeotromodo(pseint_grammar.DeotromodoContext ctx) {
        super.exitDeotromodo(ctx);
        pilaActual.pop();
    }


    @Override
    public void enterMientras(pseint_grammar.MientrasContext ctx) {
        super.enterMientras(ctx);
        Bloque mientras = new Bloque(TipoBloque.WHILE);
        if (pilaActual.isEmpty())
        {
            raizActual.addHijo(mientras);
        }
        else
        {
            pilaActual.peek().addHijo(mientras);
        }
        pilaActual.push(mientras);
    }

    @Override
    public void exitMientras(pseint_grammar.MientrasContext ctx) {
        super.exitMientras(ctx);
        pilaActual.pop();
    }

    @Override
    public void enterRepetir(pseint_grammar.RepetirContext ctx) {
        super.enterRepetir(ctx);
        Bloque repetir = new Bloque(TipoBloque.DOWHILE);
        if (pilaActual.isEmpty())
        {
            raizActual.addHijo(repetir);
        }
        else
        {
            pilaActual.peek().addHijo(repetir);
        }
        pilaActual.push(repetir);
    }

    @Override
    public void exitRepetir(pseint_grammar.RepetirContext ctx) {
        super.exitRepetir(ctx);
        pilaActual.pop();
    }

    @Override
    public void enterPara(pseint_grammar.ParaContext ctx) {
        super.enterPara(ctx);
        Bloque para = new Bloque(TipoBloque.FOR);
        if (pilaActual.isEmpty())
        {
            raizActual.addHijo(para);
        }
        else
        {
            pilaActual.peek().addHijo(para);
        }
        pilaActual.push(para);
    }

    @Override
    public void exitPara(pseint_grammar.ParaContext ctx) {
        super.exitPara(ctx);
        pilaActual.pop();
    }

    @Override
    public void enterUsofuncion(pseint_grammar.UsofuncionContext ctx) {

        super.enterUsofuncion(ctx);
    }

    @Override
    public void exitUsofuncion(pseint_grammar.UsofuncionContext ctx) {
        super.exitUsofuncion(ctx);
        raizActual.sumarLlamadas(1);
        int parametros=ctx.operacion().size();
        raizActual.sumarPuntuacion(2+parametros);
        raizActual.sumarLineasEfectivas(1);
    }

    @Override
    public void enterConOperadores(pseint_grammar.ConOperadoresContext ctx) {
        super.enterConOperadores(ctx);
        raizActual.sumarPuntuacion(1);
    }

    @Override
    public void exitPseint(pseint_grammar.PseintContext ctx) {
        super.exitPseint(ctx);
        for(BloqueRaiz funcion: programa.values()){
            puntuacionPrograma += funcion.getPuntuacion();
        }
    }
}
