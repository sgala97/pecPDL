import java.util.ArrayList;
import java.util.HashMap;

public class Bloque
{
    private ArrayList<Bloque> hijos;
    private TipoBloque tipo;
    private int puntuacion = 0;

    public Bloque(TipoBloque tipo)
    {
        this.tipo = tipo;
    }
    public void addHijo(Bloque bloque){
        hijos.add(bloque);
    }

    public TipoBloque getTipo() {
        return tipo;
    }

    public int getPuntuacion()
    {
        return puntuacion;
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