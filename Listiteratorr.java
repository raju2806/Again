import java.util.*;
public class Listiteratorr {
    
    public static void main(String[] args) {
        
        LinkedList<Object> ll = new LinkedList<>();

        for(int i =0; i<=10; i++)
        {
            ll.add(i);
        }

        System.out.println(ll);

        ListIterator<Object> lt = ll.listIterator();

        // ListIterator<Integer> lt = ll.listIterator();

        while(lt.hasNext())
        {
            Integer i = (Integer) lt.next();
            if(i%2==0){System.out.println(i);}
            else if(i==3){lt.remove();}
            else if(i==7){lt.set("Tannu");}
            else {lt.set("Raju");}

        }

        System.out.println(ll);
    }
}
