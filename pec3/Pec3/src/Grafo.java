import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Grafo {

    private int contador = 1;
    private HashSet<Integer> nodos = new HashSet<>();
    private int aristas = 0;
    private String grafo = "";
    private BloqueRaiz bloqueRaiz;
    private HashMap<Integer, String> etiquetas = new HashMap<>();

    public Grafo(BloqueRaiz bloque){
        bloqueRaiz=bloque;
    }
    public String generarGrafo(){
        initGrafo();
        for(Bloque hijo:bloqueRaiz.getHijos())
        {
            recorrerArbol(hijo);
        }
        endGrafo();
        return grafo;

    }

    private void recorrerArbol(Bloque bloque)
    {
        TipoBloque tipoBloque = bloque.getTipo();

        switch(tipoBloque)
        {
            case STANDARD:
                addEstandar();
                break;
            case IFELSE:
                addIfElse(bloque);
                break;
            case SWITHCASE:
                addSwitch(bloque);
                break;
            case FOR:
                addFor(bloque);
                break;
            case WHILE:
                addWhile(bloque);
                break;
            case DOWHILE:
                addDoWhile(bloque);
                break;
        }
    }

    private void subBloque(Bloque bloque)
    {
        for(Bloque bloqueHijo: bloque.getHijos())
        {
            recorrerArbol(bloqueHijo);
        }
    }

    private void addEstandar()
    {
        addArista();
        addEtiquetas(contador,"standard");
        addNodo(contador++);
    }

    private void addIfElse(Bloque bloque)
    {
        //nodo condicion
        int nodoInicialAux = contador;
        addArista();
        addEtiquetas(contador,"condition");
        addNodo(contador++);
        //nodo if
        subBloque(bloque.getHijos().get(0));
        //nodo final
        int nodoFinalAux = contador;
        addArista();
        addNodo(contador++);
        addFinSubGrafo();
        addNodo(nodoInicialAux);
        if(bloque.getHijos().size()==2){
            subBloque(bloque.getHijos().get(1));
        }
        addArista();
        addNodo(nodoFinalAux);
    }

    private void addSwitch(Bloque bloque){
        int nodoInicial=contador;
        int nodoFinal=0;
        addArista();
        addNodo(contador++);
        for(int i=0;i<bloque.getHijos().size();i++ ){
            if(i==0) {
                subBloque(bloque.getHijos().get(0));
                nodoFinal = contador;
                addArista();
                addNodo(contador++);
                addFinSubGrafo();
            }else {
                addNodo(nodoInicial);
                subBloque(bloque.getHijos().get(i));
                addArista();
                addNodo(nodoFinal);
                addFinSubGrafo();
            }
        }
        addNodo(nodoFinal);
        }

    private void addFor(Bloque bloque){
        addArista();
        addNodo(contador++);
        int nodoFor= contador;
        addArista();
        addNodo(contador++);
        subBloque(bloque);
        addArista();
        addNodo(nodoFor);

    }
    private void addWhile(Bloque bloque){

        int nodoWhile= contador;
        addArista();
        addNodo(contador++);
        subBloque(bloque);
        addArista();
        addNodo(nodoWhile);

    }

    private void addDoWhile(Bloque bloque){
        int nodoDo= contador;
        subBloque(bloque);
        addArista();
        addNodo(contador++);
        addArista();
        addNodo(nodoDo);
        addFinSubGrafo();
        addNodo(contador-1);


    }

    public String generarGrafoLlamadas(HashMap<String, BloqueRaiz> funciones)
    {
        grafo += "digraph G{";
        for(String string:bloqueRaiz.getLlamadas())
        {
            grafo += "algoritmo";
            addArista();
            addEtiquetas(contador, string);
            addNodo(contador);
            addFinSubGrafo();
            subGrafoLlamadas(contador++, funciones.get(string), funciones);
        }
        transformarEtiquetas();
        grafo += "}";
        return grafo;
    }

    private void subGrafoLlamadas(int nodo, BloqueRaiz bloqueRaiz ,HashMap<String, BloqueRaiz> funciones)
    {
        for(String string: bloqueRaiz.getLlamadas())
        {
            addNodo(nodo);
            addArista();
            addEtiquetas(contador, string);
            addNodo(contador);
            addFinSubGrafo();
            subGrafoLlamadas(contador++, funciones.get(string), funciones);
        }
    }

    private void initGrafo()
    {
        grafo += "digraph G{ inicio";
    }

    private void endGrafo()
    {
        addArista();
        grafo += "fin;";
        transformarEtiquetas();
        grafo += "}";
    }

    private void addFinSubGrafo(){
        grafo += ";";
    }
    private void addArista(){
        aristas++;
        grafo += " -> ";
    }
    private void addNodo(int nodo){
        nodos.add(nodo);
        grafo += String.valueOf(nodo);
    }

    private void addEtiquetas(int n, String nombre)
    {
        etiquetas.put(n,nombre);
    }

    private void transformarEtiquetas()
    {
        for(int n: this.etiquetas.keySet())
        {
            grafo += String.valueOf(n) + "[label = " + this.etiquetas.get(n) + "] ";
        }
    }

    public int getComplejidad(){
        return aristas-nodos.size();
    }

    public BloqueRaiz getInfoGrafo()
    {
        return bloqueRaiz;
    }
}
