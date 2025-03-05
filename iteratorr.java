import java.util.*;
public class iteratorr {
    
    public static void main(String[] args) {
        
        ArrayList<Object> al = new ArrayList<>();

        for(int i =0; i<=10; i++)
        {
            al.add(i);
        }

        // Iterator<Integer> it = al.iterator();
         Iterator<Object> it = al.iterator();

         while(it.hasNext())
         {
            Integer i = (Integer) it.next();
            if(i%2==0){System.out.println(i);}
            else{it.remove();}
         }

         System.out.println(al);
    }
}
