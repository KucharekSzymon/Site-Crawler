import java.util.LinkedHashSet;

public class Writer {
    String sorted = "";
    String Url;
    /**
     * @parm sorted
     * String that can be displayed and is made by write function
     */
    LinkedHashSet<String> Linklist;
    public Writer(LinkedHashSet<String> list, String url){
        this.Linklist = list;
        this.Url = url;
    }

    /**
     * @return
     * Functions return a string propelly parsed
     */
    public String write (){
        for (String x: Linklist) {
            sorted += Url+x+"\n";
        }
        return sorted+"\n"+Linklist.size()+" links found.";
    }
}
