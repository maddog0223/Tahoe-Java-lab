package part_02;


import java.util.Scanner;

/**
* Part 2 Exercise 5:
*
*      Write a program called PrintNumberInWord which prints "ONE", "TWO",... ,
*      "NINE", "OTHER" if the int variable "number" is 1, 2,... , 9, or other, respectively.
*      Use a "nested-if" statement;
*
*
*/
public class Exercise_05 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number from 1 through 9");

        int a = scanner.nextInt();

            if (a == 1) {
                System.out.println("ONE");
            } else if (a == 2) {
                System.out.println("TWO");
            } else if (a == 3) {
                System.out.println("THREE");
            } else if (a == 4) {
                System.out.println("FOUR");
            } else if (a == 5) {
                System.out.println("FIVE");
            } else if (a == 6) {
                System.out.println("SIX");
            } else if (a == 7) {
                System.out.println("SEVEN");
            } else if (a == 8) {
                System.out.println("EIGHT");
            } else if (a == 9) {
                System.out.println("NINE");
            } else {
                System.out.println("OTHER");
            }

            System.out.println(a);
        }

    }


