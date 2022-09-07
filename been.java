import java.util.*;
class been
{
	public static void main(String args[])
	{
		int a,r,n=0,t;
		Scanner s=new Scanner(System.in);
		System.out.print("enter the value of a=");
		a=s.nextInt();
		t=a;
		while(a!=0)
		{
			r=a%10;
			n=r*r+n;
			a=a/10;
		}
		System.out.println(""+n);
		if(t<n)
		{
			System.out.println("been");
		}
		else
		{
			System.out.println("not been");
		}
	}
}