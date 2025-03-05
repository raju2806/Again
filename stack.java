import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        
        Stack<Integer> s = new Stack<>();
        s.push(10);
        s.push(23);
        s.push(59);
        s.push(175);
        s.push(51);
        System.out.println(s.peek());//it return top value;
        System.out.println(s.pop());//it remove top value
        System.out.println(s.isEmpty());// it return true or false
        System.out.println(s.search(59));// it return index no
        System.out.println(s.size());//it size of stack;
        System.out.println(s.elementAt(2));// it return specific value of index;
        System.out.println(s.contains(59));//it return true or false
        System.out.println(s.capacity()); // it return how much value it can store;
        s.clear();// it delete all value of stack;
        System.out.println(s);// after delete it return empty stack;
        System.out.println();



    }    
}
