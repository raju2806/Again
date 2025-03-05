import java.util.HashSet;

public class hashset1 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("zebra");
        set.add("Apple");  // Adds "Apple"
        set.add("Banana"); // it add in last
        set.add("Mango");
        set.add(null);
        set.add("Ram");
        set.add(null);
        System.out.println( set.add("Banana"));// it return false if object are available;
        System.out.println(set);
        set.remove("Banana");// it remove object if it is available in hashset;
        System.out.println(set);
        System.out.println(set.contains("Apple"));// it return ture and false;
        set.size();// it return size of set; 
        set.isEmpty();//it return hashset is empty or not;

        set.clear();  // Removes all elements from the set

    }
}
