package part_04;

import org.jcp.xml.dsig.internal.SignerOutputStream;

import java.util.Scanner;
/**

 Read in 10 integers from the user. Place all 10 integers into an array in the order they were received.
 Print out the second integer received, followed by the 4th, then the 6th, then the 8th, then the 10th.
 The print out the 9th, 7th, 5th, 3rd, and 1st.

 Example input: 1,2,3,4,5,6,7,8,9,10
 Example output: 2,4,6,8,10,9,7,5,3,1

 Output can be on one line or many lines. However you like.

 */
class InputArrays {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any 10 integers");


        int[] array = new int[10];

        for (int i =0; i < array.length; i ++){


            System.out.println("Enter number " + (i+1));
            array[i]=scanner.nextInt();
        }

        System.out.println(array[0] + " " + array[1]+ " " + array[2]+ " " + array[3]+ " " + array[4] + " " + array[5]
                + " " + array[6]+ " " + array[7]+ " " + array[8]+ " " + array[9]);


        System.out.println(array[1] + " " + array[3]+ " " + array[5]+ " " + array[7]+ " " + array[9] + " " + array[8]
                + " " + array[6]+ " " + array[4]+ " " + array[2]+ " " + array[0]);






    }
}