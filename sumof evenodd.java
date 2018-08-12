import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
    	Scanner s=new Scanner(System.in);
        int n1=s.nextInt();
        int n2=s.nextInt();
        int sum=0;
        {
           sum=n1+n2;
            {
                if(sum%2==0)
                {
                       System.out.println("even");
                }
                else if(sum%2!=0)
                {
                       System.out.println("odd");
                }
             }
        }
	}
}
