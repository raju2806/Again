// import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
// import java.util.TreeMap;

public class TreemapDemo3 {
    
    public static void main(String[] args)
    {
        HashMap<Integer, String> mat = new LinkedHashMap<>();

        mat.put(13,"mike");
        mat.put(5,"adam");
        mat.put(7,"stalling");
        mat.put(17,"stalling");
        mat.put(88,"raju bhai");

        System.out.println(mat);
    }
}
