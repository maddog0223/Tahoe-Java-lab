package part_11;

/**
 Write a generic method to exchange the positions of two different elements in an array.
 */

public class Exercise_02 <T> {


    public <T> T[] Swap(T[] a) {


           T temp;

               temp = a[0];

                a[0] = a[0 + 1];

                a[0 + 1] = temp;

          for (T item : a){

              System.out.println(item);
          }

          return a;
   }
}

