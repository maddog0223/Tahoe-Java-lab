package part_01;

/**
 * Part 1 Exercise 10:
 *
 *      If a runner runs 12 kilometers in 30 minutes and 30 seconds. What is his/her average speed
 *      in miles per hour. (Tip: 1 mile = 1.6 km)
 *
 */

public class Exercise_10 {
    public static void main(String[] args) {

        double miles = 12/1.6;
        double av2 = (miles/(30.5))*60;

        System.out.println(" the average mile per hour is " + av2 + "miles per hour");
    }
}