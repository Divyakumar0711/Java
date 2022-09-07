/*
searching
*/
import java.util.*;
class searching
{
	public static void main(String args[])
	{
		int a[]=new int[5];
		int i,n,b=0;
		Scanner s=new Scanner(System.in);
		for(i=0;i<=4;i++)
		{
			System.out.print("enter the value of a["+i+"]=");
			a[i]=s.nextInt();
		}
		System.out.println("enter the choice=");
		n=s.nextInt();
		for(i=0;i<=4;i++)
		{
			if(a[i]==n)
			{
				b=1;
			}
		}
		if(b==1)
		{
			System.out.println("present in array");
		}
		else
		{
			System.out.println("not present in array");
		}
	}
}

		
			
	  
