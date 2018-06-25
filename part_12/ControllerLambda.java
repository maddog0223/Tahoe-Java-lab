package part_12;

public class ControllerLambda {

    public static void main(String[] args) {

        Interface1 l1 = (n) -> {

            int num = 4;
            return num;
        };


        l1 = (a) -> {

            int r =3;

            return r;
        };

        Interface2 l2 = (s) -> {

           String one = "Ultimate";
           String two = "Baseball";
           String three = "Vollyball";

           return s;
        };

        l2 = (t) -> {

            String one = "Kickball";
            String two =  "Synchronized Swimming ";
            String three = "Diving";

            return t;
        };



    }
}
