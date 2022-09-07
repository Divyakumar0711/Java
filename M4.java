/*
diagonal matrix
1 0 0
0 1 0
0 0 1
*/
import java.util.*;
class M4
{
	public static void main(String args[])
	{
		int i,j,l=0,k=0;
		int a[][]=new int[3][3];
		Scanner s=new Scanner(System.in);
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print("enter the value of a=");
				a[i][j]=s.nextInt();
			}
		}
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(""+a[i][j]);
			}
			System.out.println("");
		}
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				if(i==j && a[i][j]==1)
				{
					k++;
				}
				if(i!=j && a[i][j]==0)
				{
					k++;
				}
				if(i+j==2 && a[i][j]==1)
				{
					l++;
				}
				if(i+j!=2 && a[i][j]==0)
				{
					l++;
				}
			}
		}
		if(k==9 || l==9)
		{
			System.out.print("diagonal matrix");
		}
		else
		{
			System.out.print("not diagonal matrix");
		}
	}
}

	

		
		
	
				