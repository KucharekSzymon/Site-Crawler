import java.util.LinkedHashSet;
import java.util.regex.*;

public class Sorter {
    String Content;
    String Url;

    /**
     *
     * @param content
     * content is a string with downloaded content of a page
     */
    public Sorter(String content, String url){
        this.Content = content;
        this.Url = url;
    }

    /**
     *
     * @return
     * Return Linked HashSet of all links on domain
     */
     String sort(){
    return Url;
    }
}
