import java.util.*;

public class TablaDeSimbolos
{
    private HashMap<String, BloqueRaiz> funciones = new HashMap<>();
    private BloqueRaiz programa;
    private int puntuacionPrograma = 0, lineasEfectivas = 0, puntuacionCiclomatica;
    private BloqueRaiz raizActual;
    private Stack<Bloque> pilaActual = new Stack<>();

    public void addFuncion(String nombre, BloqueRaiz bloqueRaiz)
    {
        funciones.put(nombre, bloqueRaiz);
    }
    public HashMap<String, BloqueRaiz> getFunciones()
    {
        return funciones;
    }

    public BloqueRaiz getPrograma()
    {
        return programa;
    }

    public void setPrograma(BloqueRaiz programa)
    {
        this.programa = programa;
    }

    public void sumarPuntuacionPrograma(int n)
    {
        puntuacionPrograma += n;
    }

    public int getPuntuacionPrograma()
    {
        return puntuacionPrograma;
    }

    public void sumarLineasEfectivas(int n)
    {
        lineasEfectivas += n;
    }

    public int getLineasEfectivas()
    {
        return puntuacionPrograma;
    }

    public void sumarPuntuacionCiclomatica(int n)
    {
        puntuacionCiclomatica += n;
    }

    public int getPuntuacionCiclomatica()
    {
        return puntuacionCiclomatica;
    }

    public int sumar(int n)
    {
        return puntuacionPrograma;
    }

    public BloqueRaiz getRaizActual()
    {
        return raizActual;
    }

    public void setRaizActual(BloqueRaiz raizActual)
    {
        this.raizActual = raizActual;
    }

    public void push(Bloque bloque)
    {
        pilaActual.push(bloque);
    }

    public Bloque peek()
    {
        return pilaActual.peek();
    }

    public Bloque pop()
    {
        return pilaActual.pop();
    }

    public boolean isEmpty()
    {
        return pilaActual.isEmpty();
    }
}
