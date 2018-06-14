package part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 2:
 *
 *      Write the necessary code that reads the radius
 *      and the length of a cylinder from the console
 *      then computes the volume and area and prints the
 *      results to the console.
 *
 *      tip: area = radius * radius * 3.1415 (roughly)
 */

public class Exercise_02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("I will calculate the area of a circle. Enter a radius of a circle");

        double r = scanner.nextDouble();
        double a = (r*r)*Math.PI;
        System.out.println("The area is " + a);
        System.out.println("Now I will calculate the volume of a cylinder. Please enter the length");
        double l = scanner.nextDouble();
        double v = a*l;

        System.out.println("The volume is " + v );

    }

}