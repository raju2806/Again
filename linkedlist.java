import java.util.*;
public class linkedlist {
    public static void main(String[] args)
    {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(10);//
        ll.addFirst(20); // it add value at first;
        ll.addLast(30);//   it add value at last;
        ll.add(1, 40); // it add value at index no
        ll.add(60); // it add value at last;
        System.out.println(ll); // it print all value of linkedlist;
        
        LinkedList<Integer> ll2 = new LinkedList<>();
        ll2.add(50);
        ll2.add(70);
        ll2.add(80);    
        ll2.add(90);
        ll2.add(100);
        ll.addAll(ll2); // it add all value of ll2 to ll;
        System.out.println(ll);
        ll.remove(1); // it remove value of index no;
        ll.removeFirst(); // it remove first value;
        ll.removeLast(); // it remove last value;
        ll.removeFirstOccurrence(50); // it remove first occurance of value;
        ll.removeLastOccurrence(100); // it remove last occurance of value;
        // ll.remove(Integer.valueOf(70)); // it remove value;
        // ll.removeAll(ll2); // it remove all value of ll2 from ll;
        // ll2.clear(); // it remove all value of ll2;
        System.out.println(ll);
        ll.get(2); // it return value of index no;
        ll.set(2, 45); // it replace old value with new value;
        System.out.println(ll);
        ll.retainAll(ll2);
        System.out.println(ll.contains(70));
        System.out.println(ll);                             
        
    }
}
