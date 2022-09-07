/*
2*2 matrix
*/
import java.util.*;
class M1
{
	public static void main(String args[])
	{
		int a[][]=new int[2][2];
		int i,j;
		Scanner s=new Scanner(System.in);
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				System.out.print("enter the value of a=");
				a[i][j]=s.nextInt();
			}
		}
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				System.out.print(""+a[i][j]);
			}
			System.out.println("");
		}
	}
}
				
			
