import java.util.*;
public class vectorr {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        System.out.println(v.capacity());// it give me capacity of vector;
        v.add(45);// it add last in the vector;
        v.add(76);
        v.add(62);
        v.add(766);
        v.add(75);
        v.add(79);
        v.add(1,78);// it add in index no in vector;
        System.out.println(v);
        System.out.println(v.get(1));// it return index value;
        v.set(2, 56);// it replace old value with new value; 
        v.remove(1);// it remove value of index;
        System.out.println(v);
        v.remove(Integer.valueOf(62));// it remove first occurance of value;
        System.out.println(v.size());// it return size of vector;
        System.out.println(v.contains(76));// it return boolean value true and false;
        System.out.println(v.capacity());
        v.trimToSize();// it release unused memory;
        System.out.println(v.capacity());
        v.toArray();// it convert vector to array;
        System.out.println(v);
    }
}
