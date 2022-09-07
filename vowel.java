import java.util.*;
class vowel
{
	public static void main(String args[])
	{
		char a;
		Scanner s=new Scanner(System.in);
		System.out.print("enter the charater=");
		a=s.next().charAt(0);
		if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u'||a=='A'||a=='E'||a=='I'||a=='O'||a=='U')
		{
			System.out.println("vowel");
		}
		else
		{
			System.out.println("non vowel");
		}
	}
}