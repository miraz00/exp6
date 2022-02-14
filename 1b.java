import java.util.*;

class main
{
	public static void main(String args[])
	{
		try
		{
		int a[]=new int[5];
		System.out.println(a[5]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
		  System.out.println(e);
		}
	}
	
 }
