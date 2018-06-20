package part_08.Exception_Practice;

public class ExceptionClass {

    public static void main(String[] args) {


        try {

            try {
                int a = 4;

                int b = 0;
                int c = a / b;
                System.out.println(c);
            } catch (ArithmeticException ze) {

                System.out.println("Can't divide by zero");
            }

            int[] array = new int[10];
            System.out.println(array[20]);

        }catch (ArrayIndexOutOfBoundsException aro) {

            System.out.println("The array does not exist");
        }
    }

}
