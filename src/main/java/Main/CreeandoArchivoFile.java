package Main;

import java.io.*;

public class CreeandoArchivoFile {

    public static void crearArchivo (String nombreArchivo){ // crea un archivo en el disco
        File archivo = new File(nombreArchivo);
        try(PrintWriter salida = new PrintWriter(archivo)) {
            System.out.println("se a creado el archivo");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } ;

    }
    /**
     *   este metodo sobre escribe la informacion en el archivo
     *  @param nombreArchivo recive el nombre del Archivo o dirección en el cual vamos a escribir
     * @param contenido recive el contenido que se escribira
     * @File esta clase se instancia para crear el archivo
     * @PrintWrite me permite guardar el archivo en memoria pero solo se crea en el disco duro una vez se alla cerrado
     * el archivo por esa razon utilizamosa el try catch resource
     * */
    public static void escribirArchivo (String nombreArchivo,String contenido){

        File archivo = new File(nombreArchivo);

        try(PrintWriter salida = new PrintWriter(archivo)) {

            salida.println(contenido);
            System.out.println("se ha escrito el archivo");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } ;


    }
    /**
     *  este metodo no sobre escribe la informacion del archivo,anexa informacion a la ya existente
     *  @param nombreArchivo recive el nombre del Archivo o dirección en el cual vamos a escribir
     *  @param contenido recibe el contenido que se escribirá
     *  @File esta clase se instancia para crear el archivo o obtener la direccion del archivo
     *
     * */
    public static void anexarDatos (String nombreArchivo, String contenido){
        File archivo = new File(nombreArchivo);
        try(PrintWriter salida = new PrintWriter(new FileWriter(archivo,true))){
            salida.println(contenido);
            System.out.println("se anexo el dato");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    public static void leerArchivo (String nombreArchivo){
        File archivo = new File(nombreArchivo);
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(archivo))){
            String lectura = bufferedReader.readLine(); // readLine() me permite imprimir lineas completas
            while (lectura != null ){ // se ejecutara el cicli siempre y cuando lectura sea diferente de null
                System.out.println("lectura = " + lectura);
                lectura = bufferedReader.readLine();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

