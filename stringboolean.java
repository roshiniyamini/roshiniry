import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		boolean flag=false;
		for(int i=0;i<str.length();i++)
		{
			if((str.charAt(i)=='0')||(str.charAt(i)=='1'))
			{
				flag=true;
			}
			else
			{
				flag=false;
				break;
			}
		}
		if(flag==true)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
		
	}
}
