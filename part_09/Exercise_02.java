package part_09;
//Demonstrate how to read file using BufferedInputStream - print each byte - be sure to close all connections

import java.io.*;

public class Exercise_02 {

    public static void main(String[] args) throws FileNotFoundException {



        FileInputStream fi = new FileInputStream("/home/pandydog1/Documents/CodingNomads/example.txt");
        int i;

        try(   BufferedInputStream bi = new BufferedInputStream(fi)) {

            i = bi.read();

           if (i != -1){

               System.out.println(bi.read());

           }
        } catch (IOException e) {
            e.printStackTrace(); }
    }
}
