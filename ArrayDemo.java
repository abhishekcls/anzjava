import java.util.Scanner;

public class ArrayDemo {

    public static void main(String[] args) {
        int arr[]=new int[5];
        System.out.println("Enter "+arr.length+" elements");
        Scanner s=new Scanner(System.in);

        int sum=0,min,max,ser;
        float avg;
        boolean found=false;

        for(int i=0;i<arr.length;i++)
        {
            arr[i]=s.nextInt();
            sum+=arr[i];
        }

        System.out.println("Sum is "+sum);
        avg=(float)sum/5;
        System.out.println("Avg is "+avg);

        min=max=arr[0];

        for(int i=1;i<arr.length;i++)
        {
            if(min>arr[i])
                min=arr[i];
            else if(max<arr[i])
                max=arr[i];
        }
        System.out.println("Min is "+min);
        System.out.println("Max is "+max);

        System.out.print("Enter a no to search: ");
        ser=s.nextInt();
        s.close();
        
        for(int a:arr)
        {
            if(ser==a)
            {
                found=true;
                System.out.println("Found");
                break;
            }
        }
        if(!found)
        {
            System.out.println("Not Found");
        }
    }
}