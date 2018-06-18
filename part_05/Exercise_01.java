package part_05;

import java.util.ArrayList;

/**
 * Write three classes. The Class_01 should contain the main method. The main method should create an instance
 * of Class_02. Class_02 must have several private instance variables. Use Class_01 to set the variables in Class_02.
 * Within Class_02, create an instance of Class_03, which must also have several private variables. Use Class_02 to set
 * the private variables within Class_03. Please note, do not use the constructor of any of these classes to set the
 * private instance variables. Use System.out.println at various points to demonstrate the flow of execution and
 * the varying state of each private variable. You may name these classes whatever you like.
 */

class One {

    public static void main(String[] args) {
        Two class2 = new Two();

    int c = class2.getChocolate()* class2.getLollipop();


        System.out.println(c);

    }
}


     class Two {

         public static void main(String[] args) {
             Three classthree = new Three();

             classthree.getSan();
            classthree.getThird();

             System.out.println(classthree.getSan() + "\n"+ classthree.getThird());

         }



        private int lollipop = 5;

        private int chocolate = 4;

        public int getChocolate() {
            return chocolate;
        }

        public void setChocolate(int chocolate) {
            this.chocolate = chocolate;
        }

        public int getLollipop() {
            return lollipop;
        }

        public void setLollipop(int lollipop) {
            this.lollipop = lollipop;
        }
    }

    class Three {
        private String third ="Tahoe";
        private int san = 33;

        public int getSan() {
            return san;
        }

        public void setSan(int san) {
            this.san = san;
        }

        public String getThird() {
            return third;
        }

        public void setThird(String third) {
            this.third = third;
        }
    }
