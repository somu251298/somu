package somu;


public class Blass
{
	
	public void s1()
	{
		int a =10;
		float b= 10.5f;
		float c=a+b;
		System.out.println(c);
	}
	public void s2()
	{
		double a= 100.0;
		float b=15.5f;
		double c=a*b;
		System.out.println(c);
	}
	public static void s3()
	{
		float a=20.5f;
		int b=10;
		float c=a/b;
		System.out.println("s3=" +c);
	}
	public static void s4()
	{
		int a=400;
		float b=15.6f;
		float c=a-b;
		System.out.println(c);
	}
	public static void main(String[] args)
	{
		Blass z = new Blass();
		z.s1();
		z.s2();
		s3();
		s4();
	}
}
