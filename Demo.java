public class Demo
{
	void disp()
	{
		System.out.println("Hello");
	}
	static public void main(String args[])
	{
		Demo d=new Demo();
		d=new Demo();
		d.disp();
	}
}