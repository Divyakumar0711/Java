//1 to 5 print
import java.util.*;
class A1
{
	public static void main(String args[])
	{
		int a[]=new int [5];
		int i;
		Scanner s=new Scanner(System.in);
		for(i=0;i<=4;i++)
		{
		System.out.println("enter the value of a=");
		a[i]=s.nextInt();
		}
		System.out.println();
		for(i=0;i<=4;i++)
		{
			System.out.println(""+a[i]);
		}
	}
}