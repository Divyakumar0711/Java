import java.util.*;
class armstrong
{
	public static void main(String args[])
	{
		int t,a,n,r=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the value of a=");
		a=s.nextInt();
		t=a;
		while(a!=0)
		{
			n=a%10;
			r=n*n*n+r;
			a=a/10;
		}
		System.out.println(""+r);
		if(t==r)
		{
			System.out.println("amstrong");
		}
		else
		{
			System.out.println("not amstrong");
		}
	}
}
		