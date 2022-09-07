/*
          0 1 1 1 1 1 1 1 1 0
          1 0 1 1 1 1 1 1 0 1
          1 1 0 1 1 1 1 0 1 1
          1 1 1 0 1 1 0 1 1 1
          1 1 1 1 0 0 1 1 1 1
          1 1 1 1 0 0 1 1 1 1
          1 1 1 0 1 1 0 1 1 1
          1 1 0 1 1 1 1 0 1 1
          1 0 1 1 1 1 1 1 0 1
          0 1 1 1 1 1 1 1 1 0
*/ 
import java.util.*;
class p15
{
	public static void main(String args[])
	{
		int i,j;
		for(i=1;i<=10;i++)
		{
			for(j=1;j<=10;j++)
			{
				if(i+j==11 || i==j)
				{
					System.out.print("0");
				}
				else
				{
					System.out.print("1");
				}
				
			}
			System.out.println("");
		}
	}
}