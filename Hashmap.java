import java.util.*;

public class Hashmap
{
    public static void main(String[] args) {
        
        int otp =(100000+ new Random().nextInt(99999));
        System.out.println("Enter you mobile no:");
        Scanner sc = new Scanner(System.in);
        String mobile= sc.next();
        System.out.println(otp);
        HashMap<String,Integer> has = new HashMap<>();

        has.put(mobile, otp);

        System.out.println("Enter Otp to validate This:");

        int validate= sc.nextInt();
        
        if(has.get(mobile).equals(validate))
        {
            System.out.println("Sucessful loging:");
        }
        else 
        {
            System.out.println("Invalid Otp: ");
        }

        sc.close();
    }
}