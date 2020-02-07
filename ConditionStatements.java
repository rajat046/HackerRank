/* 
Task 

Given an integer, , perform the following conditional actions:

If  is odd, print Weird
If  is even and in the inclusive range of  to , print Not Weird
If  is even and in the inclusive range of  to , print Weird
If  is even and greater than , print Not Weird
Complete the stub code provided in your editor to print whether or not  is weird.
*/

import java.util.Scanner;

public class ConditionStatements
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n % 2 != 0)
        {
            System.out.println("Weird");
        }
        if(n % 2 == 0)
        {
            if(n >= 2 && n <= 5)
                System.out.println("Not Weird");
            if(n >= 6 && n <= 20)
                System.out.println("Weird");
            else if(n > 20)
                System.out.println("Not Weird");
        }
    }
}
