package Main;

import java.io.*;
import java.util.Arrays;
import java.util.List;

public class LeerBufferRider {

    public static void main(String[] args) {
        leer("C:\\Users\\Luis Nuñez\\Desktop\\prueba\\arc.txt");
        escribir("C:\\Users\\Luis Nuñez\\Desktop\\prueba\\arc2.txt", Arrays.asList("HTML","SQL","JAVA"));
    }
    public static void leer(String ruta){
        try ( BufferedReader bufferedReader = new BufferedReader(new FileReader(ruta))){
            String linea;
            while ((linea = bufferedReader.readLine()) != null) {
                System.out.println(linea);

            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }//leer

    public static void escribir(String ruta, List<String> datos){

        try(BufferedWriter bufferedReader = new BufferedWriter(new FileWriter(ruta))){
            for( String linea : datos){
                bufferedReader.write(linea);
                bufferedReader.newLine();

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    /* static void pdf(){
        File file = new File("creo.pdf");
        PdfWriter pdfWriter = null;
        try {
            pdfWriter = new PdfWriter(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        PdfDocument pdfDocument = new PdfDocument(pdfWriter);
        Document document = new Document(pdfDocument);

        Paragraph p = new Paragraph("hola mundo");

        document.add(p);

        document.close();
        pdfDocument.close();

        System.out.println("PDF creado");
    }*/
}

