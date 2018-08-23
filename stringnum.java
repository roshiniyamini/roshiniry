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
		int K=s.nextInt();
		
		for(int i=0;i<K;i++)
		{
		System.out.print(st.charAt(i));
		}
	}
}
