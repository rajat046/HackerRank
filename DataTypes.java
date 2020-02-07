/*
Task
Complete the code in the editor below. The variables i, d, and s are already declared and initialized for you. You must:

1. Declare 3 variables: one of type int, one of type double, and one of type String.
2. Read 3 lines of input from stdin (according to the sequence given in the Input Format section below) and initialize your  variables.
3. Use the + operator to perform the following operations:
	1. Print the sum of i plus your int variable on a new line.
	2. Print the sum of d plus your double variable to a scale of one decimal place on a new line.
	3. Concatenate s with the string you read as input and print the result on a new line.
Note: If you are using a language that doesn't support using + for string concatenation (e.g.: C), you can just print one variable immediately following the other on the same line. The string provided in your editor must be printed first, immediately followed by the string you read as input.
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DataTypes {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);

        /* Declare second integer, double, and String variables. */

        int i2 = scan.nextInt();
        double d2 = scan.nextDouble();
        String s2 = scan.nextLine();/* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.

        
        /* Print the sum of both integer variables on a new line. */
        System.out.println(i + i2);
        /* Print the sum of the double variables on a new line. */
		System.out.println(d + d2);
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */
        while(scan.hasNext())
        {
            s2 = s + scan.nextLine();
        }
        System.out.print(s2);

        scan.close();
    }
}
