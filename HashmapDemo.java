import java.util.*;


public class HashmapDemo {
    public static void main(String[] args)
    {
        HashMap<String,Integer> m = new HashMap<>();
        m.put("chiranjeevi",700);
        m.put("balash",800);
        m.put("venkatesh", 200);
        m.put("nagaraja",500);
        m.put("nagaraja",600);

        Set<String> s = m.keySet();
        System.out.println(s);

        Collection<Integer> c = m.values();
        System.out.println(c);

        Set<Map.Entry<String,Integer>> s1 = m.entrySet();
        System.out.println(s1);
        // System.out.println(m);

        Iterator<Map.Entry<String, Integer>> itr = s1.iterator();

        while(itr.hasNext())
        {
            Map.Entry<String, Integer> m1 = itr.next();
            // Map.Entry m1 = (Map.Entry) itr.next();

            System.out.println(m1.getKey()+"----"+m1.getValue());


        }

    }
}


// s
//         HashMap<String, Integer> m = new HashMap<>();
//         m.put("chiranjeevi", 700);
//         m.put("balash", 800);
//         m.put("venkatesh", 200);
//         m.put("nagaraja", 500);

//         // Display the set of keys
//         Set<String> keys = m.keySet();
//         System.out.println("Keys: " + keys);

//         // Display the collection of values
//         Collection<Integer> values = m.values();
//         System.out.println("Values: " + values);

//         // Display the set of entries
//         Set<Map.Entry<String, Integer>> entries = m.entrySet();
//         System.out.println("Entries: " + entries);

//         // Display the entire map
//         System.out.println("Map: " + m);

//         // Iterate over the entries
//         Iterator<Map.Entry<String, Integer>> itr = entries.iterator();
//         System.out.println("\nIterating through the entries:");
//         while (itr.hasNext()) {
//             Map.Entry<String, Integer> entry = itr.next();
//             System.out.println(entry.getKey() + " ---- " + entry.getValue());
