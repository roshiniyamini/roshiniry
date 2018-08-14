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
        int M=s.nextInt();
        int result=0;
        if(N>M)
        {
            result=N-M;
        }
       else if(M>N)
       {
           result=M-N;
        }
        if(result%2==0)
       {
           System.out.println("even");
       }
      else if(result%2!=0)
      {
          System.out.println("odd");
       }
     }
}    
      
      
  
