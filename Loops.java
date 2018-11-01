import java.util.Scanner;

/**
 * Loops
 */
public class Loops {

    public static void main(String[] args) {
        String ch;
        Scanner s=new Scanner(System.in);
               
        do
        {
            System.out.println("Hello");
            System.out.println("Enter your choice");
            ch=s.next();
        }while(ch.equals("y"));
        s.close();
    }
}