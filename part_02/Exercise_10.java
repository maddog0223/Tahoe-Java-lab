package part_02;


/**
 * Part 2 Exercise 10:
 *
 *      Write a program that prints out every prime number between 1 and 100
 *
 */
public class Exercise_10 {

    public static void main(String[] args){
        int i;
        for (i = 1; i <= 100; i++){
            boolean prime = true;
            for (int x = i-1; x > 1; x--){
                if (i % x == 0){
                    prime = false;
                }
            }
            if (prime){
                System.out.println(i + " is prime.");
            }
        }
    }
}