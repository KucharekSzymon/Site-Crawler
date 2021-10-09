import java.util.LinkedHashSet;

public class Writer {
    String sorted = "";
    /**
     * @parm sorted
     * String that can be displayed and is made by write function
     */
    LinkedHashSet<String> Linklist;
    public Writer(LinkedHashSet<String> list){
        this.Linklist = list;
    }

    /**
     * @return
     * Functions return a string propelly parsed
     */
    public String write (){
        for (String x: Linklist) {
            sorted += x+"\n";
        }
        return sorted+"\n"+Linklist.size()+" links found.";
    }
}
