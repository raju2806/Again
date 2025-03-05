import java.util.*;

public class hashmap2 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int otp = (100000 +new Random().nextInt(10000));
        
        System.out.println("Enter your mobile no:");
        String mobile = sc.nextLine();
        HashMap<String,Integer> has = new HashMap<>();
        System.out.println(otp);   
        has.put(mobile,otp);

        System.out.println("Enter Otp to validate This:");
        int validate = sc.nextInt();

        if(has.get(mobile).equals(validate))
        {
            System.out.println("Sucessful loging:");
        }
        else
        {
            System.out.println("Invalid Otp:");
        }

        sc.close();
    }
           
}
