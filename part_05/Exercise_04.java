package part_05;

/**
 * Write two classes. Class_01 should have the main(). Class_02 must have 3 or more private variables. Class_02 must
 * also have at least 3 overloaded constructors. In Class_01.main() create several instances of Class_02 using each
 * overloaded constructor. Each constructor should do something slightly differently. Class_02 must have at least
 * two private instance variables. Using the various instances of Class_02 that you now have in Class_01, call a method
 * within each instance of Class_02 to modify Class_02's private instance variables.
 *
 */

class A {

    public static void main(String[] args) {


        B oneb = new B(4.5);
        B twob = new B(3.0, 4.0);
        B threeb = new B();



    }
}


    class B {

        private double a;
        private double b;


        B() {

        }

        B(double a) {

            this.a = a;

        }

        B(double a, double b) {

            this.a = a;
            this.b = b;
        }

        public double getA() {
            return a;
        }

        public void setA(double a) {
            this.a = a;
        }

        public double getB() {
            return b;
        }

        public void setB(double b) {
            this.b = b;
        }
    }

