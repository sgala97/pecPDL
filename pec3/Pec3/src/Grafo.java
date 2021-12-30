import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Grafo {

    private int contador = 1;
    private HashSet<Integer> nodos = new HashSet<>();
    private int aristas = 0;
    private String grafo = "";

    public Grafo(){

    }
    public void generarGrafo(BloqueRaiz bloqueRaiz){
        initGrafo();
        for(Bloque hijo:bloqueRaiz.getListaHijos())
        {
            recorrerArbol(hijo);
        }
        endGrafo();
        System.out.println(grafo);

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
        addNodo(contador++);
    }

    private void addIfElse(Bloque bloque)
    {
        //nodo condicion
        int nodoInicialAux = contador;
        addArista();
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
    private void initGrafo()
    {
        grafo += "digraph G{ inicio";
    }

    private void endGrafo()
    {
        addArista();
        grafo += "fin;}";
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

    public int getComplejidad(){
        return nodos.size()-aristas+2;
    }
}
