package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class LeerURL {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.google.com/") ;
            InputStreamReader inputStreamReader = new InputStreamReader(url.openStream());
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String linea;
            String html = "";
            while ((linea = bufferedReader.readLine())!=null) {
                html+= linea + "\n";
            }
            System.out.println(html);

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
