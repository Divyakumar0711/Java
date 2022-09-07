import java.util.*;
class fibonacci
{
	public static void main(String args[])
	{
		int n,a=0,b=1,i,c;
		Scanner s=new Scanner(System.in);
		System.out.print("enter the value of n=");
		n=s.nextInt();
		System.out.print(""+a+""+b);
		for(i=1;i<=n;i++)
		{
			c=a+b;
			a=b;
			b=c;
		System.out.print(" "+c);
		}
	}
}
		
		