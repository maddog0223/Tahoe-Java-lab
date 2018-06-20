package part_08.Exception_Practice;

public class ExceptionClass {

    public static void main(String[] args) {

       try {
           int a = 4;

        int b = 0;
        int c = a/b;
        System.out.println(c);
       }catch (ArithmeticException ze){

           System.out.println("Can't divide by zero");
       }
    }
}
