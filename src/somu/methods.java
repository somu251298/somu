package somu;

public class methods 
{
	public void s1 ()  //1.instance method
	{
		System.out.println("manual");
		s4();  //direct method
		methods.s4(); //class call
		
		methods a = new methods();  //object 
		//a.s4();   
	}
	public void s2()   //2.instance method
	{
		System.out.println("tester");
		s1();
	}
	public static void s3()  //3.static method
	{
		System.out.println("automation");
		s4();
		
		methods b = new methods();
		b.s2();
	}
	public static void s4()  //4.static method
	{
		System.out.println("analyst");
	}
	public static void main(String[] args)    
	{
		methods c = new methods();
	  // c.s1();
		//c.s2();
		
		//s3();
		//s4();
		

	}

}
