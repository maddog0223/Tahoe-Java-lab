package part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 4:
 *
 *      Pounds to kilos
 *
 *      One pound is 0.454 kilograms.
 *
 *
 */

public class Exercise_04 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number so I can convert the number from pounds to kilograms");
        double p = scanner.nextDouble();
        double k = .454;
        double total = p*k;



        System.out.println(p + " pounds is equivalent to " + total + " kilograms");

    }


}