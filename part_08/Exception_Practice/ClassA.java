package part_08.Exception_Practice;

import java.util.Scanner;

public class ClassA  {

    public static void main(String[] args) throws ArithmeticException {

        ClassA classa = new ClassA();
        ClassB classb = new ClassB();

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number in a and a b so I can divide them");

        System.out.println("Enter number 1");

        double a = scan.nextDouble();

        System.out.println("Now enter a number 2");

        double b = scan.nextDouble();

        classb.divide(a,b);

        System.out.println(a + "/" + b + " = " + classb.divide(a,b));






        }
    }
