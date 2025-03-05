import java.util.*;
public class treesetdemo6 {
    public static void main(String[] args )
    {
        TreeSet<String> t = new TreeSet<>(new MyComparator());
        t.add("Raju");
        t.add("Shyam");
        t.add("Ankit");
        t.add("Babu");
        t.add("Kajal");
        System.out.println(t);
    }
}

class MyComparator implements Comparator<String>
{
    public int compare(String o1, String o2)
    {
        return -(o2.compareTo(o1));
    }
}
