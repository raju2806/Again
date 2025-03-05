import java.util.*;

public class Arraylist {
    public static void main(String[] args) 
    {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);

        ArrayList<Integer> al2 = new ArrayList<>(Arrays.asList(4,6,7,3,2,6,5));

         List<Integer> al3 = new ArrayList<>(Arrays.asList(70,80,40,50,440));
        al.addAll(al2);

        al.addAll(3,al3);
        System.out.println(al);
        Collections.reverse(al);
        System.out.println(al);
        System.err.println();
        Collections.reverse(al3);
        System.out.println(al3);
        System.out.println();
        // System.err.println(al.remove(6));
        System.out.println(al);
        // al.retainAll(al3); // it remove all element except al3
        System.out.println(al);
        // al.remove(Integer.valueOf(10));
        System.out.println(al.contains(4)); // it return true or false
        System.out.println(al);
        System.out.println(al.containsAll(al3)); // it return true or false

        Iterator<Integer> it = al.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}
