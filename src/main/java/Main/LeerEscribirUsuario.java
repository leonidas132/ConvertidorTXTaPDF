package Main;

import java.io.*;
import java.sql.SQLOutput;

public class LeerEscribirUsuario {
    public static void main(String[] args) {
        String ruta = "C:\\Users\\Luis Nuñez\\Desktop\\prueba\\objetoUsuario.txt";

        Usuario usuario1 = new Usuario(1,"user1");
        Usuario usuario2 = new Usuario(2,"user2");

        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(ruta))){
            objectOutputStream.writeObject(usuario1);
            objectOutputStream.writeObject(usuario2);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(ruta))) {
            Usuario user1 = (Usuario) objectInputStream.readObject();
            Usuario user2 = (Usuario) objectInputStream.readObject();
            System.out.println(user1);
            System.out.println(user2);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

}
