import java.util.*;

public class WeakHashMaap {

    public static void main(String[] args)
    {
        // insertaion not preserved it is based on the hashcode value;
        HashMap<Temp , Object> m = new HashMap<>();

        Temp t = new Temp();

        m.put(t,"raju");

        System.out.println(m);

        t = null;
        System.gc();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(m);
    }
    
}

class Temp {
    @Override
    public String toString() {
        return "Temp";
    }
    public void finalize()
    {
        System.out.println("Finlize Called...");
    }
}
