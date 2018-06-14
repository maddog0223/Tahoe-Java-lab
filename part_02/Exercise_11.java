
package part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 11:
 *
 *      Calculate investment value
 *
 *      Recieved the following args from user:
 *          - investment amount
 *          - interest rate in percentage
 *          - number of years to invest
 *
 *      Print future value to the console.
 *
 */

public class Exercise_11 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the amount of your investment");

        double inv = scanner.nextDouble();

        System.out.println("Now your interest rate in percentage");

        double p = scanner.nextDouble();

        System.out.println("Now the years of investment");
        int y = scanner.nextInt();

        double total = (inv-(inv*p/100))*y;

        System.out.println(total + " is your total invest in" + y + " years");


    }

}


