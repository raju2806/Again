import java.util.*;
public class StackDemo {

    public static void main(String[] args) {
        
        Stack<Integer> s = new Stack<>();
        s.push(20);
        s.push(56);
        s.push(98);
        System.out.println(s);
        // s.pop();
        System.out.println(s);

      System.out.println(s.search(20));
    }


}
