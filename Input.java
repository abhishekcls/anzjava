import java.util.Scanner;

class Input
{
	static public void main(String args[])
	{
		byte s1,s2,s3;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter 3 sub marks");
		s1=s.nextByte();
		s2=s.nextByte();
		s3=s.nextByte();
		float total=s1+s2+s3;
		//short total=(short)(s1+s2+s3);
		System.out.println(total);
		float per=total/3;
		System.out.println(per);
	}
}