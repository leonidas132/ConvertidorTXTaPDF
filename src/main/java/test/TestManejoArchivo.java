package test;

import static Main.CreeandoArchivoFile.*;

public class TestManejoArchivo {
    public static void main(String[] args) {
        String  nombreArchivo = "archi.txt";
       crearArchivo(nombreArchivo);
       anexarDatos(nombreArchivo,"hola mundo java ");
       anexarDatos(nombreArchivo,"adios");
       anexarDatos(nombreArchivo,"vamos todos aprender ");
       // escribirArchivo(nombreArchivo,"mundo erroneo");
       leerArchivo(nombreArchivo);
    }
}
