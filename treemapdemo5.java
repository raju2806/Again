import java.util.*;


public class treemapdemo5 {
    public static void main(String[] args) {
        TreeMap<Integer, String> t = new TreeMap<>(new myComparator());

        // TreeMap<Integer, String> t = new TreeMap<>();
        t.put(11, "Raju");
        t.put(100, "Raju");
        t.put(103, "Raju");
        t.put(101, "Raju");
        t.put(105, "Raju");
        t.put(89, "Raju");
        System.out.println(t);
    }    
}



class myComparator implements Comparator<Integer>
{
   public int compare(Integer o1, Integer o2) {

        // return -(o1.compareTo(o2));

        return o2-o1;
    }
}