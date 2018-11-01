import java.util.Scanner;

/**
 * Switch
 */
public class Switch {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a day number: ");
        byte day=s.nextByte();
        s.close();
        switch(day)
        {
            case 1: System.out.println("Sunday"); break;
            case 2: System.out.println("Monday"); break;
            case 3: System.out.println("Tuesday"); break;
            default: System.out.println("Wrong input");break;
        }
    }
}