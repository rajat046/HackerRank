/*
Task
Given an integer, n, print its first 10 multiples. Each multiple n x i (where 1 <= i <= 10) should be printed on a new line in the form: n x i = result.
*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Table
{
    public static void main(String agrs[])
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i = 1; i <= 10; i++)
        {
            int result = n * i;
            System.out.println(n+ " x " +i+ " = " +result);
        }
    }
}
