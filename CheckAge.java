/**
 * CheckAge
 */
import java.util.Scanner;
public class CheckAge {

    public static void main(String[] args) {
        short age;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter your age: ");
        age=s.nextShort();
        
        if(age<13)
        {
            if(age<5)
            {
                System.out.println("Infant");
            }
            else
            {
                System.out.println("Child");
            } 
        }
        else if(age<20)
        {
            System.out.println("Teenager");
        }
        else if(age<60)
        {
            System.out.println("Adult");
        }
        else
        {
            System.out.println("Old");
        }
    }
}