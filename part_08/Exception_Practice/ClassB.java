package part_08.Exception_Practice;

public class ClassB {

   double divide(double num1, double num2) throws ArithmeticException {



       if (num1==0||num2==0){

           throw new ArithmeticException("Can't divide by zero!!");

       }

       return num1/num2;





    }
}
