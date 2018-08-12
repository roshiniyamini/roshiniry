import java.util.*;
import java.lang.*;
import java.io.*;


class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String orig, rev="";
      int  len;
      Scanner scan = new Scanner(System.in);
      orig = scan.nextLine();
      
      len = orig.length();
	  
      for(int i=len-1; i>=0; i--)
      {
          rev = rev + orig.charAt(i);
      }
	  
        System.out.print(rev);
   }
}
	
