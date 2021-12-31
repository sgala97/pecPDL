import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.List;

public class HtmlGenerator {

    public static void generate(List<Grafo> grafos){
        crearDotSvg(grafos);
        for(Grafo grafo: grafos.subList(1,grafos.size()))
        {
            grafos.get(0).getInfoTabla().sumarPuntuacionCiclomatica(grafo.getComplejidad());
        }

        File f = new File( "./html/index.html");
        try {
            f.createNewFile();

            BufferedWriter html= new BufferedWriter(new FileWriter("./html/index.html"));
            html.write("""
                    <!DOCTYPE html>
                    <head>
                        <title>PEC3</title>
                        <style>        body {
                            background-color: rgb(211,234,228) ;
                            }        hr.rounded {
                            border-top: 8px solid #bbb;
                            border-radius: 5px;
                            }
                    </style></head>
                    <body>
                    """);

            String complejidad;
            String puntuacion;
            String lineas;
            String variables;
            String llamadas;
            String numParametros;
            String parametros;
            String retorno;
            String nombre;

            complejidad= String.valueOf(grafos.get(0).getInfoTabla().getPuntuacionCiclomatica());
            puntuacion= String.valueOf(grafos.get(0).getInfoTabla().getPuntuacionPrograma());
            lineas= String.valueOf(grafos.get(0).getInfoTabla().getLineasEfectivas());
            html.write( "<hr class=\"rounded\">\n" +
                    "<h1>Resumen Programa</h1>\n" +
                    "<h2> Resumen complejidad: "+"<strong>" + complejidad + "</strong>" +"</h2>\n"+
                    "<h2> Resumen puntuacion: "+"<strong>" + puntuacion + "</strong>"+"</h2>\n"+
                    "<h2> Resumen lineas de codigo efectivas: "+"<strong>" + lineas + "</strong>"+"</h2>\n"+
                    "<img src=\"./"+String.valueOf(0)+".svg\" width=\"50%\" alt=\"grafo\">\n <hr class=\"rounded\">");

            nombre= String.valueOf(grafos.get(1).getInfoGrafo().getNombre());
            variables= String.valueOf(grafos.get(1).getInfoGrafo().getVariables());
            complejidad= String.valueOf(grafos.get(1).getComplejidad());
            puntuacion= String.valueOf(grafos.get(1).getInfoGrafo().getPuntuacion());
            llamadas= String.valueOf(grafos.get(1).getInfoGrafo().getNumeroLlamadas());
            lineas= String.valueOf(grafos.get(1).getInfoGrafo().getLineasEfectivas());

            html.write( "<hr class=\"rounded\">\n" +
                    "<h1>"+ nombre  + "</h1>\n" +
                    "<h2> Complejidad: "+ "<strong>" + complejidad + "</strong>"+"</h2>\n"+
                    "<h2> Puntuacion: "+ "<strong>" + puntuacion + "</strong>"+"</h2>\n"+
                    "<h2> Variables declaradas: "+ "<strong>" + variables + "</strong>"+"</h2>\n"+
                    "<h2> Llamadas a funciones: "+ "<strong>" + llamadas + "</strong>"+"</h2>\n"+
                    "<h2> Lineas de codigo efectivas: "+ "<strong>" + lineas + "</strong>"+"</h2>\n"+
                    "<img src=\"./"+String.valueOf(1)+".svg\" width=\"50%\" alt=\"grafo\">\n <hr class=\"rounded\">");



            for(int i = 2; i<grafos.size(); i++)
            {

                nombre= String.valueOf(grafos.get(i).getInfoGrafo().getNombre());

                parametros = "";
                for(String nombreParametro: grafos.get(i).getInfoGrafo().getParametros())
                {
                    parametros+= nombreParametro +",";
                }
                parametros = parametros.substring(0,parametros.length()-1);

                retorno= String.valueOf(grafos.get(i).getInfoGrafo().getRetorno());
                variables= String.valueOf(grafos.get(i).getInfoGrafo().getVariables());
                complejidad= String.valueOf(grafos.get(i).getComplejidad());
                puntuacion= String.valueOf(grafos.get(i).getInfoGrafo().getPuntuacion());
                llamadas= String.valueOf(grafos.get(i).getInfoGrafo().getNumeroLlamadas());
                numParametros= String.valueOf(grafos.get(i).getInfoGrafo().getNumeroParametros());
                lineas= String.valueOf(grafos.get(i).getInfoGrafo().getLineasEfectivas());

                html.write( "<hr class=\"rounded\">\n" +
                        "<h1>"+ nombre + "("+ parametros + "): " + retorno + "</h1>\n" +
                        "<h2> Complejidad: "+ "<strong>" + complejidad + "</strong>"+"</h2>\n"+
                        "<h2> Puntuacion: "+ "<strong>" + puntuacion + "</strong>"+"</h2>\n"+
                        "<h2> Variables declaradas: "+ "<strong>" + variables + "</strong>"+"</h2>\n"+
                        "<h2> Llamadas a funciones: "+ "<strong>" + llamadas + "</strong>"+"</h2>\n"+
                        "<h2> Parametros: "+ "<strong>" + numParametros + "</strong>"+"</h2>\n"+
                        "<h2> Lineas de codigo efectivas: "+ "<strong>" + lineas + "</strong>"+"</h2>\n"+
                        "<img src=\"./"+String.valueOf(i)+".svg\" width=\"50%\" alt=\"grafo\">\n <hr class=\"rounded\">");
            }

            html.write("</body>\n" +
                    "</html>");
            html.close();
        }catch(Exception e){}

    }
    public static void crearDotSvg(List<Grafo> grafos){
        File directorioHtml= new File("./html");
        directorioHtml.mkdir();
        for(int i = 0; i<grafos.size(); i++) {
            String strGrafo;
            if(i==0)
            {
                strGrafo = grafos.get(i).generarGrafoLlamadas();
            }
            else
            {
                strGrafo= grafos.get(i).generarGrafo();
            }

            String nombre=String.valueOf(i);
            File grafoDot =  new File("./"+nombre+".dot");
            try {
                FileWriter fw = new FileWriter("./html/"+nombre+".dot");
                fw.write(strGrafo);
                fw.close();
                Runtime.getRuntime().exec("dot -Tsvg ./html/" +nombre+".dot -o ./html/"+nombre+".svg -Gbgcolor=transparent ");
            }catch (Exception e){}
        }
    }


}
