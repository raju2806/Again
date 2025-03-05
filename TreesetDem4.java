import java.util.*;
class Employee implements Comparable<Object>
{
    String name;
    int eid;

    Employee(String name, int eid)
    {
        this.name = name;
        this.eid = eid;
    }

    public String toString()
    {
        return name+"-----"+eid;
    }
    @Override
    public int compareTo(Object o) {

        int eid1 = this.eid;
        Employee e = (Employee) o;

        int eid2 = e.eid;

        if(eid1>eid2){return -1;}
        else if(eid1<eid2){return 1;}
        else {return 0;}


    }
}



public class TreesetDem4 {
    public static void main(String[] args)
    {
        
        TreeSet<Object> t  = new TreeSet<>(new myComparator());

        Employee e = new Employee("raju", 10);
        Employee e1 = new Employee("rnkit", 12);
        Employee e2= new Employee("divya", 19);
        Employee e3 = new Employee("tanwar", 109);
        Employee e4 = new Employee("himesh", 1);
        Employee e5 = new Employee("shiva", 145);

        t.add(e);
        t.add(e1);
        t.add(e2);
        t.add(e3);
        t.add(e4);
        t.add(e5);


        System.out.println(t);
    }
}



class myComparator implements Comparator<Object>
{

    @Override
    public int compare(Object o1, Object o2) 
    {
        Employee e1 = (Employee) o1;
        Employee e2 = (Employee) o2;

        int s1 = e1.eid;
        int s2 = e2.eid;
    
       return Integer.compare(s2,s1);
    }

}

// class myComparator implements Comparator<Object>
// {
//     @Override
//     public int compare(Object o, Object o2)
//     {
//         Employee e1 = (Employee) o;
//         Employee e2 = (Employee) o2;

//         String s = e1.name;
//         String s2 = e2.name;

//         return  s.compareTo(s2);
//     }
// }

   