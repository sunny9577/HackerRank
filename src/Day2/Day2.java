/**
 * Created by Sunny on 9/16/2017.
 */

import java.util.Scanner;

public class Day2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        int tipPercent = scan.nextInt(); // tip percentage
        int taxPercent = scan.nextInt(); // tax percentage
        scan.close();
        double tip = mealCost * (tipPercent / 100d);
        double tax = mealCost * (taxPercent / 100d);
        double total = (mealCost + tax + tip);
        int totalCost = (int) Math.round(total);
        System.out.println("The total meal cost is " + totalCost + " dollars.");
    }
}