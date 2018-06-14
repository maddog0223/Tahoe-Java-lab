package part_02;


import java.util.Scanner;

/**
* Part 2 Exercise 7:
*
*      Write the necessary code to receive a number in minutes from the user, up to 1,000,000,000.
*      How many years and days does that number in minutes represent?
*
*      For this exercise each year has 365 days.
*
*/
public class Exercise_07 {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println(" Enter amy number from 0 to 1,000,000,000 of minutes so that I can convert it to the number of years and days");

        long a = scanner.nextInt();


        long year = a / 525600;
        long days = year % 365;


            System.out.println(a + " minutes equal " + year + " year(s) and " + days + " day(s)");
        }


    }

