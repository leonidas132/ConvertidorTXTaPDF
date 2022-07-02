package ConvertidorTXTaPDF;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;

import java.io.*;

public class Prueva {
    /*Para este ejercicio tube que hacer uso de las siguientes librerías org.slf4j,slf4j-simple ,com.itextpdf
    * en el método leer() lo primero que hacemos es leer nuestro archivo txt haciendo uso de la clase bufferreadr
    * una vez leído extraemos la información y la guardamos en una variable la cual pasamos como parámetro
    * al método crearPdf dode se creara el archivo y luego se escribirá la información */



    public static final String RUTA_PDF = "C:\\Users\\Luis Nuñez\\Desktop\\prueba\\arc22.pdf";
    public static  String RUTA ="C:\\Users\\Luis Nuñez\\Desktop\\prueba\\arc22.txt";
    public static void main(String[] args) throws IOException {
        System.out.println("leyendo el archivo txt");
        String contenido = leer(RUTA);

        // se crea el archivo pdf con la ruta especificada
        File file = new File(RUTA_PDF);
        file.getParentFile().mkdirs();
        System.out.println("creando el documento pdf");
        // pasamos los parámetros de la ruta donde se creara el pdf y el contenido retornado por el metodo leer
        new Prueva().crearPdf(RUTA_PDF,contenido);

    }
    public void crearPdf(String rutaPdf,String conte)throws IOException {
        // inicializo PdfWrite y le paso como parámetro la ruta donde se encontrara el archivo
        //
        PdfWriter writer = new PdfWriter(rutaPdf);

        PdfDocument pdf = new PdfDocument(writer);

        Document document = new Document(pdf);

        document.add(new Paragraph(conte));
        System.out.println("se creo el pdf");
        document.close();
    }

    public static String leer (String ruta){
        String text="";
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(ruta))) {
            String Linea;

            while ((Linea = bufferedReader.readLine())!= null){ // se cumplira el ciclo siempre y cuando no sea null
                System.out.println(Linea);
                text+= (Linea + '\n');
            }
            System.out.println(text);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        return text;
    }

}
