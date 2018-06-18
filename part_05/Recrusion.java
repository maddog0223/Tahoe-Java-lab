package part_05;

import javax.sound.midi.Soundbank;

public class Recrusion {

    public static void main(String[] args) {

        System.out.println(factorial(0));

    }

    public static long factorial(long f){

        if (f<=1){
            return 1;
        } else {

            return f*(f-1);
        }

    }
}





class Recursion2 {

    public static void main(String[] args) {

        String b = "Hello";
        System.out.println(reverse(b));

    }

    public static String reverse(String a) {

        if (a.length() == 0)

            return a;

         return reverse(a.substring(1)) + a.charAt(0);


    }

}
