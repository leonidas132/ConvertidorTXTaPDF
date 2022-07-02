package Main;

import java.io.File;
import java.lang.reflect.Array;
import java.util.Arrays;

public class App {
    public static void main(String[] args) throws InterruptedException {
       // String ruta = "C:" +File.separator+ "Users" +File.separator+"Luis Nuñez"+File.separator+"Documents" +File.separator+"alumni"+File.separator+ "Array Vectores resuelto.java";
        String ruta = "C:"+File.separator+"Users"+File.separator+"Luis Nuñez"+File.separator+"Documents"+File.separator+"alumni";
        System.out.println(ruta);
        File file = new File(ruta);
        System.out.println(file.getName());
        listarHijos(file);
       /* System.out.println(file.exists()); // verifica si existe el archivo
        System.out.println(file.isFile()); //verifica si un archivo
        System.out.println(file.isDirectory()); // verifica si es un direcctorio
        System.out.println(Arrays.toString(file.list())); //lista tdos los archivos
        System.out.println(Arrays.toString(file.listFiles())); */

       // for (File archivo: file.listFiles()){
          //  System.out.println(archivo.getName() +"-->"+(archivo.isDirectory() ? "carpeta" :"archivo"));

      //  }//


    } //main

    public static void listarHijos(File directorio) throws InterruptedException {

        for(File hijo : directorio.listFiles()) {
            Thread.sleep(1000);
            System.out.println((hijo.isDirectory() ? "Dirrectorio ":"Archivo ") + hijo.getAbsolutePath());
            if (hijo.isDirectory()){
                listarHijos(hijo);
            }
        }
    }

}
