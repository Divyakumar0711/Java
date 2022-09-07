import java.util.*;
class calculator
{
	public static void main(String args[])
	{
		int a,b,c,d;
		Scanner s=new Scanner(System.in);
		System.out.print("enter the value of a=");
		System.out.println("enter the value of b=");
		a=s.nextInt();
		b=s.nextInt();
		System.out.println("for sum1,for sub2,for multi3,for divi4=");
		c=s.nextInt();
		switch(c)
		{
			case 1:
			{
			d=a+b;
			System.out.println("addition"+d);
			break;
			}
			case 2:
			{
				d=a-b;
				System.out.println("substraction"+d);
				break;
			}
			case 3:
			{
				d=a*b;
				System.out.println("multiplication"+d);
				break;
			}
			case 4:
			{
				d=a/b;
				System.out.println("division"+d);
				break;
			}
			default:
			{
				System.out.println("invalid");
				break;
			}
		}
	}
}