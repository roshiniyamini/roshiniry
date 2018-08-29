import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int d=s.nextInt();
		int n=s.nextInt();
		int val=0;
		val=(n*(2*a+(n-1)*d))/2;
		System.out.println(val);
	}
}
