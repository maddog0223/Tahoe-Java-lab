package part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 3:
 *
 *      Read in a number in feet from the console
 *      and print out the corresponding length in meters
 *
 *      1 foot = .305 meter.
 */

public class Exercise_03 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number in so I can change from feet to meters");

        double ft = scanner.nextDouble();
        double m = ft*.305;

        System.out.println(ft + " feet is equivalent to " + m + " in meters");


    }


}