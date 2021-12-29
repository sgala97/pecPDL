import java.util.ArrayList;
import java.util.HashMap;

public class Bloque
{
    private ArrayList<Bloque> hijos;
    private TipoBloque tipo;
    private int puntuacion = 0;

    public Bloque(TipoBloque tipo)
    {
        hijos = new ArrayList<>();
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

    public ArrayList<Bloque> getHijos(){
        return hijos;
    }

    public void setPuntuacionDeHijos()
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
    public void sumarPuntuacion(int n)
    {
        puntuacion += n;
    }

}