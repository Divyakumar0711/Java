/*
a
bb
ccc
dddd
eeeee
*/
import java.util.*;
class p11
{
	public static void main(String args[])
	{
		int i,j;
		char k='a';
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(""+k);
			}
			k++;
			System.out.println("");
		}
	}
}