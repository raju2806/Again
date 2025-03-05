import java.util.*;

public class TreeMaapDemo1 {
    public static void main(String[] args)
    {

        //insertation order not preserved;
        TreeMap<Object,Object> t = new TreeMap<>();

        t.put(100,"Raju");
        t.put(103,"ankit");
        t.put(101,"yyy");
        t.put(105,"106");

        System.out.println(t);
    }
}
