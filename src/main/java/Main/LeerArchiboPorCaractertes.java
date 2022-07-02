package Main;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class LeerArchiboPorCaractertes {
    public static void main(String[] args) {
        try ( FileInputStream fichero = new FileInputStream("C:\\Users\\Luis Nuñez\\Desktop\\prueba\\arc.txt")){



           /* int ascii ;
            while ((ascii = fichero.read())!= -1){
                System.out.print((char) ascii);
            }
            */
            // opcion 2 para leler un archivo

            byte [] caracteres = fichero.readAllBytes();
            for (int i = 0; i <caracteres.length ; i++) {
                System.out.print((char) caracteres[i]);

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
