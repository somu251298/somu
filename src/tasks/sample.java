package tasks;

public class sample {

	public static void main(String[] args)
	{
		String a="it is an automation testing";
		char[] c=a.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			if(c[i]=='a' || c[i]=='e' || c[i]=='i'|| c[i]=='o'|| c[i]=='u')
			{
				System.out.println(c[i]);
			}
		}
	}
		
}
