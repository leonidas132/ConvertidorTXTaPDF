package Main;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;

import java.io.*;
import java.sql.SQLOutput;
import java.util.Scanner;


public class CreandoArchivoPdf {

    public static String RUTA ;
    public static final String RUTA_PDF = "C:\\Users\\Luis Nuñez\\Desktop\\prueba\\arc2.pdf";

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Bienvenidos ");
        System.out.println("Este es tu convertidor de archivos TXT a PDF");
        System.out.println("ingresa la ruta de tu archivo" +
                "\nejemplo: C:\\Users\\Luis Nuñez\\Desktop\\prueba\\arc2.txt");
        RUTA = teclado.nextLine();
       String rerun = leer(RUTA);


        crearpdf(RUTA_PDF,rerun);
    }

    public static String leer (String ruta){
        String text="";
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(ruta))) {
            String Linea;

            while ((Linea = bufferedReader.readLine())!= null){ // se cumplira el ciclo siempre y cuando no sea null
                System.out.println(Linea);
                text += Linea;
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        return text;
    }

    public static void crearpdf(String ruta, String contenido){
        File file = new File(ruta);

        try (PdfWriter writer =new PdfWriter(file)){
            PdfDocument pdf = new PdfDocument(writer);
            Document document = new Document(pdf);
            document.add(new Paragraph(contenido));
            System.out.println("archivo pdf creado");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }



}
