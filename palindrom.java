import java.util.*;
class palindrom
{
	public static void main(String args[])
	{
		int a,t,n=0,r;
		Scanner s=new Scanner(System.in);
		System.out.print("enter the value of a=");
	a=s.nextInt();
		t=a;
		while(a!=0)
		{
			r=a%10;
			n=n*10+r;
			a=a/10;
		}
		System.out.println(""+n);
		if(t==n)
		{
			System.out.println("palindrom");
		}
		else
		{
			System.out.println("not palindrom");
		}
	}
}