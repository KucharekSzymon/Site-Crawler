import javax.swing.*;
import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Downloader extends Thread {
    String Url;
    LinkedHashSet<String> linklist = new LinkedHashSet<>();
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
         //JOptionPane.showMessageDialog(null, "Page not found");
     }


     Pattern p = Pattern.compile("href=\"(.*?)\"");
     Matcher m = p.matcher(content);
     while (m.find()){
         if (m.group(1).charAt(0) == '/')
             linklist.add(m.group(1));
         else if (m.group(1).charAt(0) == '?')
             linklist.add("/"+m.group(1));
     }



     Writer a = new Writer(linklist,Url);
     return a.write();
 }
}
