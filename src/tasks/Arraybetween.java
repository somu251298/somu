package tasks;

public class Arraybetween {

	public static void main(String[] args)
	{
		int a[] = new int[6];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		a[5]=60;
		
		
			if(a.length%2 ==0)
			{
				int j=a.length/2;
				System.out.println(a[j-1]);
				System.out.println(a[j]);
				
			}
				else
			{
				int j=(a.length-1)/2;
				System.out.println(a[j]);
				
				
			}
		}

		
			

	}


