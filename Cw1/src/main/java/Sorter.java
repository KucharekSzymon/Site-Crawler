import java.util.LinkedHashSet;
import java.util.regex.*;

public class Sorter {
    String Url;

    /**
     *
     * @param url
     * Url is a string with downloaded content of a page
     */
    public Sorter(String url){
        this.Url = url;
    }

    /**
     *
     * @return
     * Return Linked HashSet of all links containted by page
     */
     String sort(){
        LinkedHashSet<String> linklist = new LinkedHashSet<>();
        Pattern p = Pattern.compile("href=\"(.*?)\"");
        Matcher m = p.matcher(Url);
        while (m.find())
            if (m.group(1).charAt(0) == '/')
                linklist.add(m.group(1));

        Writer a = new Writer(linklist);
        return a.write();
    }

}
