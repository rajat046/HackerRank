/* 
Task
Given an array, A, of N integers, print A's elements in reverse order as a single line of space-separated numbers.
*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class ReverseArray {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] A = new int[N];
        for(int i = 0; i < N; i++)
        {
            A[i] = scan.nextInt();
        }
        for(int j = A.length - 1; j >= 0; j--)
        {
            System.out.print(A[j] + " ");
        }
    }
}
