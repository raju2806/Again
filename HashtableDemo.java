import java.util.*;

public class HashtableDemo {
    public static void main(String[] args)
    {
        Hashtable<Object,Object> ht = new Hashtable<>();

        ht.put(new temp(5),"A");
        ht.put(new temp(2),"B");
        ht.put(new temp(6),"C");
        ht.put(new temp(15),"D");
        ht.put(new temp(23),"E");
        ht.put(new temp(16),"F");

        System.out.println(ht);
    }
}

class temp
{
    int i;
    temp(int i)
    {
        this.i=i;
    }
    public int hashcode()
    {
        return i;
    }
    public String toString()
    {
        return i+" ";
    }
}
