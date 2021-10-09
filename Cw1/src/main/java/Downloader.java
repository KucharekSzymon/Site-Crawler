import javax.swing.*;
import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class Downloader {
    String Url;

    /**
     * @param url
     * Link to html page
     */
    public Downloader(String url) {
        this.Url = url;
    }

    /**
     * @return
     * Functions to return string of sorted table by calling sorter class
     */
 public String x(){
     String content = null;
     URLConnection connection = null;
     try {
         connection =  new URL(Url).openConnection();
         Scanner scanner = new Scanner(connection.getInputStream());
         scanner.useDelimiter("\\Z");
         content = scanner.next();
         scanner.close();
     }catch ( Exception ex ) {
         JOptionPane.showMessageDialog(null, "Page not found");
     }

     Sorter a = new Sorter(content);
     return a.sort();
 }
}
