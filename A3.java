/*
find even number with location
*/
import java.util.*;
class A3
{
	public static void main(String args[])
	{
		int a[]=new int[5];
		int i;
		Scanner s=new Scanner(System.in);
		for(i=0;i<=4;i++)
		{
			System.out.print("enter the value of a["+i+"]=");
			a[i]=s.nextInt();
		}
		System.out.println("");
		for(i=0;i<=4;i++)
		{
			if(a[i]%2!=0)
			{
			System.out.println("a["+i+"]"+a[i]);
			}
		}
	}
}