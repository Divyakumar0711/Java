import java.util.*;
class prime
{
	public static void main(String args[])
	{
		int a,i,n=0;
		Scanner s=new Scanner(System.in);
		System.out.print("enter the value of a=");
		a=s.nextInt();
		for(i=2;i<n;i++)
		{
			if(n/i==0)
			{
				n=1;
			}
		}
		if(n==0)
		{
			System.out.println("prime number");
		}
		else
		{
			System.out.println("not prime number");
		}
	}
}