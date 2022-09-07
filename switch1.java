import java.util.*;
class switch1
{
	public static void main(String args[])
	{
		int a;
		Scanner s=new Scanner(System.in);
		System.out.print("enter the value of a");
		a=s.nextInt();
		switch(a)
		{
			case 1:
			{
				System.out.println("monday");
				break;
			}
			case 2:
			{
				System.out.println("tuesday");
				break;
			}
			case 3:
			{
				System.out.println("wednesday");
				break;
			}
			case 4:
			{
				System.out.println("thuresday");
				break;
			}
			case 5:
			{
				System.out.println("friday");
				break;
			}
			case 6:
			{
				System.out.println("satureday");
				break;
			}
			case 7:
			{
				System.out.println("sunday");
				break;
			}
			default:
			{
				System.out.println("invalid");
			}
		}
	}
}
			