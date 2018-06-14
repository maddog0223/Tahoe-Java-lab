package part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 12:
 *
 *
 *      Receive the following arguments from the user:
 *          - miles to drive
 *          - MPG of the car
 *          - Price per gallon of fuel
 *
 *      Display the cost of the trip in the console.
 *
 *
 */

public class Exercise_12 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the miles to drive");

        double m = scanner.nextDouble();

        System.out.println("Enter the MPG of your car");

        double g = scanner.nextDouble();

        System.out.println("Enter the price per gallon of the fuel");

        double p = scanner.nextDouble();

        double total = (g*p)*m;

        System.out.println("Your total cost of this trip will at least cost " + total);
    }

}