
import java.util.*;

public class Treeset2 {
    public static void main(String[] args) {
        
        TreeSet<Object> t = new TreeSet<>(new myComparator());
        t.add("a");
        t.add("f");
        t.add("i");
        t.add("n");


        System.out.println(t);

    }
}


class myComparator implements Comparator<Object>
{
    @Override
    public int compare(Object o1, Object o2) {
        String s = o1.toString();
        String s1 = o2.toString();

            return s.compareTo(s1);

    }

}




