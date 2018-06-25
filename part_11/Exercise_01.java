package part_11;

/**
Let's say you have an integer array and a string array. Write a single method printArray that can print all
the elements of both arrays. The method should be able to accept both integer arrays or string arrays.

Complete the code so that it prints the following lines:

 1
 2
 3
 Hello
 World

**/

public class Exercise_01 <T> {


    public <T> void printArray(T[] vals){

     for (T name: vals){

         System.out.println(name);

     }

    }


}






