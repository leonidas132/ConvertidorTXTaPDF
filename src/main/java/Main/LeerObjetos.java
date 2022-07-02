package Main;

import java.io.*;

public class LeerObjetos {
    public static void main(String[] args) {

        //escribir un objeto
        try (DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream("C:\\Users\\Luis Nuñez\\Desktop\\prueba\\objeto.txt"))) {
            dataOutputStream.writeUTF("PROTALENTO");
            dataOutputStream.writeInt(125);
            dataOutputStream.writeFloat(6.32f);




        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

//-------------------------------------------------------------------------------------------------------------------------//
        // leer un objeto
        try (DataInputStream dataInputStream = new DataInputStream(new FileInputStream("C:\\Users\\Luis Nuñez\\Desktop\\prueba\\objeto.txt"))) {

            String curso = dataInputStream.readUTF();
            int anio = dataInputStream.readInt();
            float nota = dataInputStream.readFloat();
            System.out.println(curso + " " + anio + " " + nota);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
