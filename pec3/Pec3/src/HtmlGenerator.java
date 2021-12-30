import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.List;

public class HtmlGenerator {

    public static void generate(List<Grafo> grafos){
        crearDotSvg(grafos);
        File f = new File( "./index.html");
        try {
            f.createNewFile();

            BufferedWriter html= new BufferedWriter(new FileWriter("./index.html"));
            html.write("<!DOCTYPE html>\n" +
                    "<head>\n" +
                    "    <title>PEC3</title>\n" +
                    "    <style>" +
                    "        body {\n" +
                    "        background-color: rgb(211,234,228) ;\n" +
                    "        }" +
                    "        hr.rounded {\n" +
                    "        border-top: 8px solid #bbb;\n" +
                    "        border-radius: 5px;\n" +
                    "        }\n" +
                    "</style>"+
                    "</head>\n" +
                    "<body>\n");
            int i=0;
            for(Grafo grafo:grafos) {
                String variables= String.valueOf(grafo.getVariables());
                String llamadas= String.valueOf(grafo.getLlamadas());
                String complejidad= String.valueOf(grafo.getComplejidad());
                String parametros= String.valueOf(grafo.getParametros());
                String lineas= String.valueOf(grafo.getLineasEfectivas());
                html.write( "<hr class=\"rounded\">" +
                        "<h2> Complejidad: "+complejidad+"</h2>\n"+
                        "<h2> Variables declaradas: "+variables+"</h2>\n"+
                        "<h2> Llamadas a funciones: "+llamadas+"</h2>\n"+
                        "<h2> Parametros: "+parametros+"</h2>\n"+
                        "<h2> Lineas de codigo efectivas: "+lineas+"</h2>\n"+
                        "<img src=\"./"+String.valueOf(i)+".svg\" width=\"70%\">\n <hr class=\"rounded\">");
            }
            html.write("</body>\n" +
                    "</html>");
            html.close();
        }catch(Exception e){}



    }
    public static void crearDotSvg(List<Grafo> grafos){
        int i=0;
        for(Grafo grafo : grafos) {
            String strGrafo= grafo.generarGrafo();
            String nombre=String.valueOf(i);
            File grafoDot =  new File("./"+nombre+".dot");
            try {
                FileWriter fw = new FileWriter("./"+nombre+".dot");
                fw.write(strGrafo);
                fw.close();
                Runtime.getRuntime().exec("dot -Tsvg ./" +nombre+".dot -o "+nombre+".svg -Gbgcolor=transparent");
            }catch (Exception e){}
        }
    }


}
