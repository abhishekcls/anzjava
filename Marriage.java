import java.util.Scanner;

/**
 * Marriage
 */
public class Marriage {

    public static void main(String[] args) {
        short age;
        String name,gender;
        
        Scanner s=new Scanner(System.in);
        System.out.print("Enter your name: ");
        name=s.nextLine();
        System.out.print("Age: ");
        age=s.nextShort();
        System.out.print("Gender: ");
        gender=s.next();

        if((gender.equalsIgnoreCase("m") && age>=21) ^ (gender.toLowerCase().equals("f") && age>=18))
        {
                System.out.println(name +", you are Eligible");
        }
        else
                System.out.println(name +", you are Not Eligible");
        s.close();
    }
}