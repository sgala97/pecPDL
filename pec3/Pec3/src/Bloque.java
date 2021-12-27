import java.util.ArrayList;
import java.util.HashMap;

public class Bloque
{

    private HashMap<String, Atributo> parametros;
    private HashMap<String, Atributo> variables;
    private ArrayList<Bloque> bloques;
    private int puntuacionTotal;
    private TipoBloque tipo;
}