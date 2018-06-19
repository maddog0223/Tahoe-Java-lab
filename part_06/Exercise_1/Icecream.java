package part_06.Exercise_1;

public class Icecream extends Dessert {

    private static String topping;

    Icecream(int sugarpercup, int caloriespercup) {
        super();
    }

    Icecream(){}

    public static void main(String[] args) {

        Dessert DI = new Dessert();

        DI.setSugarpercup(28);
        DI.setCaloriespercup(267);

    }

    public String flavor(String a){

        return a;

    }

    public static int scoop(int a){

        return a;
    }

    public static String Topping(String topping){

        return topping;
    }

    @Override
    void Outcome() {
        System.out.println("This is Icecream");
    }
}
