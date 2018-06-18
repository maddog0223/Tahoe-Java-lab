package part_05;

/**
 * Write one class. This class must make use of an inner/nested class. Within the nested class, set the instance variables
 * of the outer class. Also, within the inner class, call at least two methods that have a return type of int. Add these
 * two ints together and set a final instance variable in the outer with this value.
 */

class Outer{

    Inner in = new Inner();

    int a = 4;
    int b = 5;
    final int c = in.Meth1(a) + in.Meth2(b);



    class Inner{

        Outer out = new Outer();

        int a = out.a;
        int b = out.b;

        public int Meth1(int a){

            this.a = a;

            return a;
        }

        public int Meth2(int b){

            this.b = b;

            return b;
        }
    }
}

