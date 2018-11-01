import java.util.Scanner;

/**
 * Logical
 */
public class Logical {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
       /* System.out.print("Enter age: ");
        short age=s.nextShort();
        System.out.print("Enter sal: ");
        int sal=s.nextInt();

        if(age<25 ^ sal>25000)
            System.out.println("A garde employee");
        else if(age<35 ^ sal>50000)
            System.out.println("B garde employee");
        else
            System.out.println("C garde employee");*/
        
        byte marks=s.nextByte();

        if(marks>40)
            System.out.println("Pass");
        else
            System.out.println("Fail");
    }
}