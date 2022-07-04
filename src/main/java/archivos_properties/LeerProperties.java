package archivos_properties;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class LeerProperties {
    public static void main(String[] args) {
        Properties properties = new Properties();
        try {

            properties.load(new FileInputStream("src/database.properties"));
            // de esta manera podemos aceder a los atributos del archivo properties

            System.out.println("url: " + properties.getProperty("url"));
            System.out.println("usuario: " + properties.getProperty("usuario"));
            System.out.println("clave: "+properties.getProperty("clave"));
            System.out.println("driver :" + properties.getProperty("driver"));

            //tamnien podemos modificar su valor
            properties.setProperty("usuario","database");
            System.out.println(properties.getProperty("usuario"));





        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
