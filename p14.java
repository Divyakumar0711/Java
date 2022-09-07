/*
 12345678*
 1234567*9
 123456*89
 12345*789
 1234*6789
 123*56789
 12*456789
 1*3456789
 *23456789
*/
import java.util.*;
class p14
{
	public static void main(String args[])
	{
		int i,j;
		for(i=1;i<=9;i++)
		{
			for(j=1;j<=9;j++)
			{
				if(i+j==10)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(""+j);
				}
				
			}
			System.out.println("");
		}
	}
}
				
	