import java.util.ArrayList;

public class Aarrylist
{
    public static void main(String[] args) {
        // ArrayList<> l = new ArrayList();
        ArrayList<Object> l = new ArrayList<>();

        l.add("A");
        l.add(10);
        l.add("A");
        l.add(null);
        System.out.println(l);
        l.remove(2);
        System.out.println(l);
        l.add(2,"m");
        l.add("N");
        System.out.println(l);
        
    }
}