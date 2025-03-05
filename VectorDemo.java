import java.util.Vector;

public class VectorDemo {
    
    public static void main(String[] args) {
        
        Vector<Object> v = new Vector<>();
        System.out.println(v.capacity());
        for(int i =0; i<=10; i++)
        {
            v.addElement(i);
        }

        System.out.println(v);
        System.out.println(v.capacity());
        v.add("n");
        System.out.println(v);
        
    }
}
