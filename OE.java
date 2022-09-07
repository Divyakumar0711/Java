import java.util.*;
class OE
{
	public static void main(String args[])
	{
		int a;
		Scanner s=new Scanner(System.in);
		System.out.print("enter the value of a");
		a=s.nextInt();
		if(a%2==0)
		{
			System.out.println("even");
		}
		else
		{
			System.out.println("odd");
		}
	}
}
