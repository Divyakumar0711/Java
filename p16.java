/*
c       c
 o     o
  m   m
   p p 
    u
   t t
  e   e
 r	   r
s	    s 
*/
import java.util.*;
class p16
{
	public static void main(String args[])
	{
		String s="computers";
		int i,j;
		for(i=0;i<9;i++)
		{
			for(j=0;j<9;j++)
			{
				if(i+j==8 || i==j)
				{
					System.out.print(s.charAt(i));
				}
				else
				{
					System.out.print(" ");
				}
				
			}
			System.out.println("");
		}
	}
}