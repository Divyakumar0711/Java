/*
3*3 matrix
*/
import java.util.*;
class M2
{
	public static void main(String args[])
	{
		int a[][]=new int[3][3];
		int i,j;
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
		
	}
}	
	
				
				