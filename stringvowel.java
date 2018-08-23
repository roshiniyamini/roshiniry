import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
	
		String st=s.next();
		boolean flag=false;
		for(int i=0;i<st.length();i++)
		{
			if((st.charAt(i)=='a') || (st.charAt(i)=='e') ||(st.charAt(i)=='i') ||(st.charAt(i)=='o') ||(st.charAt(i)=='u'))
			{
				flag=true;
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
