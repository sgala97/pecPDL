import java.util.ArrayList;

public class BloqueRaiz
{
    private String nombre, retorno;
    private int puntuacion = 0, variables = 0, lineasEfectivas = 0;
    private ArrayList<Bloque> hijos = new ArrayList<>();
    private ArrayList<String> llamadas = new ArrayList<>();
    private ArrayList<String> parametros = new ArrayList<>();

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public String getRetorno()
    {
        return retorno;
    }

    public void setRetorno(String retorno)
    {
        this.retorno = retorno;
    }

    public void sumarPuntuacion(int n)
    {
        puntuacion += n;
    }

    public int getPuntuacion()
    {
        return puntuacion;
    }

    public void sumarVariables(int n)
    {
        variables += n;
    }

    public int getVariables()
    {
        return variables;
    }

    public void sumarLineasEfectivas(int n)
    {
        lineasEfectivas += n;
    }

    public int getLineasEfectivas()
    {
        return lineasEfectivas;
    }

    public void addHijo(Bloque bloque)
    {
        hijos.add(bloque);
    }

    public ArrayList<Bloque> getHijos()
    {
        return hijos;
    }

    public void addLlamada(String llamada)
    {
        llamadas.add(llamada);
    }

    public ArrayList<String> getLlamadas()
    {
        return llamadas;
    }

    public int getNumeroLlamadas()
    {
        return llamadas.size();
    }

    public void addParametro(String parametro)
    {
        parametros.add(parametro);
    }

    public ArrayList<String> getParametros()
    {
        return parametros;
    }

    public int getNumeroParametros()
    {
        return parametros.size();
    }

    public void setPuntuacionesHijos()
    {
        for (Bloque bloque : hijos)
        {
            if (bloque.getTipo() == TipoBloque.STANDARD ||
                bloque.getTipo() == TipoBloque.IF ||
                bloque.getTipo() == TipoBloque.ELSE ||
                bloque.getTipo() == TipoBloque.CASE ||
                bloque.getTipo() == TipoBloque.DEFAULT)
            {
                puntuacion += bloque.getPuntuacion();
            }
            else
            {
                puntuacion += Math.pow(bloque.getPuntuacion(), 2);
            }
        }
    }

}
