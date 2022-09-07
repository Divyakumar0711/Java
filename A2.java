//1 to 5 addition
import java.util.*;
class A2
{
	public static void main(String args[])
	{
		int a[]=new int[5];
		int i,sum=0;
		Scanner s=new Scanner(System.in);
		for(i=0;i<=4;i++)
		{
		System.out.print("enter the value of a=");
		a[i]=s.nextInt();
		}
		System.out.println("");
		for(i=0;i<=4;i++)
		{
			sum=sum+a[i];
		}
			System.out.print(""+sum);
		
	}
}
		
		