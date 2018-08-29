import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int P=s.nextInt();
		int T=s.nextInt();
		int R=s.nextInt();
		int result=(P*T*R/100);
		System.out.println((int)Math.floor(result));
	}
}
