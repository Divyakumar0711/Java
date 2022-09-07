import java.util.*;
class dowhile2
{
	public static void main(String args[])
	{
		int i,sum=0;
		i=1;
		do
		{
			System.out.println(""+i);
			sum=sum+i;
			i++;
		}
		while(i<=10);
		
		System.out.println("sum="+sum);
	}
}
		