import java.util.*;

public class TreeMapDemo2 {
    public static void main(String[] args)
    {
        TreeMap<Integer,Object> t = new TreeMap<>(new myComparator());

        // TreeMap<Integer, String> t = new TreeMap<>();
        t.put(11, "Raju");
        t.put(100,"Raju");
        t.put(103,"Raju");
        t.put(101,"Raju");
        t.put(105,"Raju");
        t.put(89, "Raju");
        System.out.println(t);
    }
}

class myComparator implements Comparator<Integer>
{

    @Override
    public int compare(Integer o1, Integer o2) {
        String s = o1.toString();
        String s1 = o2.toString();

        int x = Integer.parseInt(s);
        int x1 = Integer.parseInt(s1);

        return -(Integer.compare(x, x1));

        // return s.compareTo(s1);
                // return o1-o2;
    }    
    
    
}
