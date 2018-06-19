package part_06.Exercise_1;

public class Dessert_Controller {


    public static void main(String[] args) {


        Dessert Sup = new Dessert();

        Sup.Outcome();

        Dessert Superd = new Icecream(28,267);

       Superd.Outcome(); //The reference name is different from the parent class

       Superd = new Yogurt(18,150);

       Superd.Outcome();

       Superd = new FlavorsI();

       Superd.Outcome();



    }
}
