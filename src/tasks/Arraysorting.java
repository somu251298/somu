package tasks;

public class Arraysorting {

	public static void main(String[] args) {
		int b =0;
		int a[] =new int[11];
		a[0]=0;
		a[1]=1;
		a[2]=5;
		a[3]=7;
		a[4]=2;
		a[5]=4;
		a[6]=6;
		a[7]=9;
		a[8]=10;
		a[9]=8;
		a[10]=3;
		for(int j=0; j<=a.length-1;j++)
		{
		for( int i=j+1;i<=a.length-1;i++)
		{
			if(a[j] > a[i])
			{
				b = a[j];    
                a[j] = a[i];    
                a[i] = b; 
			}
			
		}
		 System.out.print(a[j] + " ");
		}
		System.out.println();
		for (int j = 0; j<=a.length-1; j++) 
		{     
	            System.out.print(a[j] + " ");    
	    } 
		

	}

}
