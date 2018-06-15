package part_03;

import java.util.Scanner;

public class Exercise_05 {

    public static void main(String[] strings) throws java.io.IOException {

        Scanner scanner = new Scanner(System.in);


        // read an integer from the user >=1 and <= 999,999,999
        System.out.println("Enter a number from 1 to 999,999,999 to determine if the number is divisible by 4 and 7");
        int i = scanner.nextInt();

        // use the && operator to see if the user's number is divisible by both 4 and 7

        if(i%4==0&&i%7==0){
            System.out.println("It is divisible by both 4 and 7 ");
        }else if (i%4!=0&&i%7!=0){

            System.out.println("Not divisible for either 4 and 7");
        }
        // use the || operator to see if the user's number is divisible by 4 or 7

        else if (i%4==0||i%7!=0){

            System.out.println("Divisible by 4");
        }
        // use the ^ operator to see if the user's number is divisible for 4 or 7 exclusively

        else if (i%4==0^i%7==0) {
            System.out.println("Only divisible by 7");
        }
        // print out the results

        System.out.println();
    }
}


