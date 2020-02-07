/*
Task
Given the meal price (base cost of a meal), tip percent (the percentage of the meal price being added as tip), and tax percent (the percentage of the meal price being added as tax) for a meal, find and print the meal's total cost.

Note: Be sure to use precise values for your calculations, or you may end up with an incorrectly rounded result!
*/

import java.util.Scanner;

public class Operators
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble();
        double tipPercent = scan.nextDouble();
        double taxPercent = scan.nextDouble();
        scan.close();

        tipPercent = mealCost * (tipPercent/100);
        taxPercent = mealCost * (taxPercent/100);

        double total = mealCost + tipPercent + taxPercent;
        int totalCost = (int)total;
        System.out.println(totalCost);
    }
}
