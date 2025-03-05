import java.util.LinkedList;

public class LinkedListDemo
{
    public static void main(String[] args) {
        LinkedList<Object> l = new LinkedList<>();
        l.add("durga");
        l.add(30);
        l.add(null);
        l.add("durga");
        System.out.println(l);
        l.set(0,"software");
        System.out.println(l);
        l.removeLast();
        System.out.println(l);
        l.add(0,"venky");
        System.out.println(l);

    }
}