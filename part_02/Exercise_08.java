package part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 8:
 *
 *      Receive a number between 0 and 1,000,000,000 from the user.
 *      Use while loop to find the number - when the number is found
 *      exit the loop and print the number to the console.
 *
 */
public class Exercise_08 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter between 0 to 1,000,000,000");

        double a = scanner.nextInt();

        double b =0;
        while ( b<=1000000000) {

            b++;

            if(b==a){
                System.out.println(b);
            }
        }
    }
}

