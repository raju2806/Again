import java.util.*;

public class TreesetDemo3 {
    public static void main(String[] args)
    {
        TreeSet<Integer> t = new TreeSet<>(new myComparable());
        t.add(20);
        t.add(12);
        t.add(28);
        t.add(15);
        t.add(29);
        t.add(14);
        t.add(86);
        t.add(20);
        
        System.out.println(t);

    }
}

class myComparable implements Comparator<Object>
{

    @Override
    public int compare(Object o1, Object o2) {
        Integer x = (Integer) o1;
        Integer y = (Integer) o2;
        return -x.compareTo(y);
    }

}
