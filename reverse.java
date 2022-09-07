import java.util.*;
class reverse
{
	public static void main(String args[])
	{
		int a,n=0,r;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the value of a=");
		a=s.nextInt();
		while(a!=0)
		{
			r=a%10;
			n=n*10+r;
			a=a/10;
		}
		System.out.println(""+n);
	}
}
	