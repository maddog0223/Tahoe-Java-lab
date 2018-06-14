package part_02;

public class Test {

    public static void main(String[] args) {

        int[] array = new int[]{3, 5, 4, 6};
        array = bubbleSort(array);

        for(int a : array){

            System.out.println(a);
        }

    }

    public static int[] bubbleSort(int[] array) {


        int temp;
        for (int a = 0; a <= array.length - 1; a++) {

            for (int b = 0; b < array.length - 1 - a; b++) {

                if (array[b] > array[b + 1]) {

                    temp = array[b];

                    array[b] = array[b+1];

                    array[b + 1] = temp;
                }

            }

        }

        return array;

    }
}
