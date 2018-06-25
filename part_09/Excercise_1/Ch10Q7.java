package part_09.Excercise_1;

import java.io.*;

/**
 *  Complete the coding challenges in questions 7 & 8 in the self test for chapter 10.

    Complete the coding challenges in questions 8 and 12 in the self test for chapter 11.
 */
public class Ch10Q7 {

    public static void main(String[] args){
        int i;

        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            fileInputStream = new FileInputStream("/home/pandydog1/Documents/CodingNomads/example.txt");
            fileOutputStream = new FileOutputStream("/home/pandydog1/Documents/CodingNomads/example.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();}

            try {
            while ((i = fileInputStream.read()) != -1){

            fileOutputStream.write(i);
            }

        }catch (IOException ae){

                System.out.println("error" + ae);
            } finally {
            try{
                if (fileInputStream != null) fileInputStream.close();
            }catch (IOException ie){

                ie.printStackTrace();
            }

            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}

