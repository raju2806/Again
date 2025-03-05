import java.util.*;

public class Vectorar {
    public static void main(String[] args) {
        Vector<String> v = new Vector<> ();
        v.add("20");
        v.add("Hii");
        v.add("Raju bhai");
        v.add("Tum hi no");
        v.add("Jay ho");
        v.add("Integer:");
        v.add(3,"Hello");
        System.out.println(v);

        v.set(2, "hey there");

        List<String> list = new ArrayList<>(Arrays.asList("1","2","3","4","5"));
        v.addAll(list);

        System.out.println(v);

        Iterator<String> itr = v.iterator();

        while(itr.hasNext()) {
            System.out.print(itr.next()+" ");
        }
    }
}
