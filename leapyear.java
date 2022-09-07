import java.util.*;
class leapyear
{
	public static void main(String args[])
	{
		int a;
		Scanner s=new Scanner(System.in);
		System.out.print("enter the leapyear a=");
		a=s.nextInt();
		if(a%4==0)
		{
			System.out.print("leapyear");
		}
		else
		{
			System.out.print("not leapyear");
		}
		
	}
}