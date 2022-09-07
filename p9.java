/*
1
31
531
7531
97531
*/
import java.util.*;
class p9
{
	public static void main(String args[])
	{
		int i,j,k;
		for(i=1;i<=5;i++)
		{
			k=2*i-1;
			for(j=1;j<=i;j++)
			{

				System.out.print(""+k);
				k=k-2;
			}
			System.out.println("");
		}
		
	}
}