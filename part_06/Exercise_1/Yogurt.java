package part_06.Exercise_1;

public class Yogurt extends Dessert {

    Yogurt(int sugar, int calories){
        super();
    }
    public static void main(String[] args) {

        Dessert dy = new Dessert();

        dy.setSugarpercup(18);
        dy.setCaloriespercup(150);

    }

    @Override
    void Outcome() {
        System.out.println("This is Yogurt");
    }
}
