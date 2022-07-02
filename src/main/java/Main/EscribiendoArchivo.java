package Main;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class EscribiendoArchivo {
    public static void main(String[] args) {
        try(FileOutputStream fichero = new FileOutputStream("C:\\Users\\Luis Nuñez\\Desktop\\prueba\\arc.txt",true)){
            List<String> cursos = Arrays.asList("pandora \n","python\n", "js\n", "html"); // asList se usa para devolver una lista de tamaño fijo respaldada por la matriz especificada.

            for (String curso: cursos){
                for (int i = 0; i <curso.length() ; i++) {
                    fichero.write(curso.charAt(i));
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
