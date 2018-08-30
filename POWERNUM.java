import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		int K=s.nextInt();
		int r=1;
		if(N>=0 && K==0)
		{
			r=1;
		}
		else if(N==0 && K>=0)
		{
			r=0;
		}
		else
		{
			for(int i=1;i<=K;i++)
			{
				r=r*N;
			}
			System.out.println(r);
		}
	}
}
