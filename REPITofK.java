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
        int count=0;
        int a[]=new int[10];
        for(int i=0;i<N;i++)
        {
            a[i]=s.nextInt();
        }
        for(int i=0;i<N;i++)
        {
        	if(a[i]==K)
        	{
        		count++;
        	}
        }
        System.out.println(count);
	}
}
