import java.util.ArrayList;

public class BloqueRaiz {
    private int puntuacion = 0, variables = 0, parametros = 0, lineasEfectivas = 0, llamadas = 0;
    private ArrayList<Bloque> hijos = new ArrayList<>();
    private ArrayList<String> funcionesLlamadas = new ArrayList<>();

    public void sumarPuntuacion(int n)
    {
        puntuacion += n;
    }

    public void sumarVariables(int n)
    {
        variables += n;
    }

    public void sumarParametros(int n)
    {
        parametros += n;
    }

    public void sumarLineasEfectivas(int n)
    {
        lineasEfectivas += n;
    }

    public void sumarLlamadas(int n)
    {
        llamadas += n;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public int getVariables() {
        return variables;
    }

    public void setVariables(int variables) {
        this.variables = variables;
    }

    public int getParametros() {
        return parametros;
    }

    public void setParametros(int parametros) {
        this.parametros = parametros;
    }

    public int getLineasEfectivas() {
        return lineasEfectivas;
    }

    public void setLineasEfectivas(int lineasEfectivas) {
        this.lineasEfectivas = lineasEfectivas;
    }

    public int getLlamadas() {
        return llamadas;
    }

    public void setLlamadas(int llamadas) {
        this.llamadas = llamadas;
    }

    public Bloque getHijos(int i)
    {
        return hijos.get(i);
    }

    public void addHijo(Bloque bloque)
    {
        hijos.add(bloque);
    }

    public ArrayList<Bloque> getListaHijos() {
        return hijos;
    }

    public String getFuncionLlamadas(int i)
    {
        return funcionesLlamadas.get(i);
    }

    public void addFuncionLlamada(String llamada)
    {
        funcionesLlamadas.add(llamada);
    }

    public void setPuntuacionesHijos()
    {
        for(Bloque bloque: hijos) {
            if (bloque.getTipo() != TipoBloque.ESTANDAR)
            {
                puntuacion += Math.pow(bloque.getPuntuacion(), 2);
            }
            else
            {
                puntuacion += bloque.getPuntuacion();
            }
        }
    }

}
