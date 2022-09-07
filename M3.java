/*
addition of matrix
*/
import java.util.*;
class M3
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
		int b[][]=new int[2][2];
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				System.out.print("enter the value of b=");
				b[i][j]=s.nextInt();
			}
		}
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				System.out.print(""+b[i][j]);
			}
			System.out.println("");
		}
		System.out.print("addition of matrix=");
		System.out.println("");
		int c[][]=new int[2][2];
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(""+c[i][j]);
			}
			System.out.println("");
		}
	}
}
		
	

			
		



		
				