/*
sorting
*/
import java.util.*;
class sorting
{
	public static void main(String args[])
	{
	int a[]=new int[5];
	int i,j,b;
	Scanner s=new Scanner(System.in);
	for(i=0;i<=4;i++)
	{
		System.out.print("enter the value of a["+i+"]=");
		a[i]=s.nextInt();
	}
	for(i=0;i<=4;i++)
	{
		for(j=i+1;j<=4;j++)
		{
			if(a[i]>a[j])
			{
			b=a[i];
			a[i]=a[j];
			a[j]=b;
			}
		}
	}
	System.out.print("accending order is=");
	for(i=0;i<=4;i++)
	{
		System.out.print(""+a[i]);
	}
	}
	
}
