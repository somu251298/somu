 package tasks;

public class Primeno {

	public static void main(String[] args) 
	
	{
		
		for(int j=2;j<=50;j++)
		{
	         int a=0;
	         for(int i=1;i<=j;i++)
	         {
	            if(j%i==0)
	            {
	               a++;
	            }
	         }
	         if(a==2)
	         {
	         System.out.print(j+" ");
	         }
	      }
			
			
		}
		

	
}


