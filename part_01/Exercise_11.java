package part_01;

/**
 * Part 1 Exercise 11:
 *      In the U.S., if there is:
 *          - One person who is born every 6 seconds
 *          - One person who dies every 12 seconds
 *          - One person who immigrates every 40 seconds
 *
 *      Write the necessary code to display the total population for the next 3 years (without a leap year)
 *
 *      Let's say the current population is 380,123,456.
 *
 */

public class Exercise_11 {

    public static void main(String[] args) {

        int a = ((3153600/6)*3)+380123456;
        int b = (380123456-((3153600/12)*3));
        int c = (380123456 + ((3153600/40)*3));
        int total = a+b+c;
        System.out.println("the total population after 3 years is " + total);
    }
}