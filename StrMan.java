/*
Task
Given a string, S, of length N that is indexed from 0 to N - 1, print its even-indexed and odd-indexed characters as 2 space-separated strings on a single line (see the Sample below for more detail).
Note: 0 is considered to be an even index.
*/



import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class StrMan
{
	public static void main(String[] args) 
	{
        	Scanner scan = new Scanner(System.in);
        	int t = scan.nextInt();
		scan.close();
        	for(int i = 0; i < t; i++)
        	{
           		String S = scan.next();
           		for(int j = 0; j < S.length(); j++)
            		{
                		if(j % 2 == 0)
                    			System.out.print(S.charAt(j));
            		}
            		System.out.print(" ");
            		for(int k = 0; k < S.length(); k++)
           		{
                		if(k % 2 != 0)
                    			System.out.print(S.charAt(k));
            		}
            		System.out.println("");
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
   		}
  	}
}
