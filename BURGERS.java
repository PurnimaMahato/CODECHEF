/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		
		for(int i=0;i<T;i++)
		{
		    int A = scan.nextInt();
		    int B = scan.nextInt();
		    int min = ((A<B)?A:B);
		    System.out.println(min);
		}
	}
}
