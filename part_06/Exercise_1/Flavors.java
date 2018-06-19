package part_06.Exercise_1;

class FlavorsI extends Icecream{

private String taste;

    FlavorsI(int sugar, int calories, double cost){

        super();
    }
    FlavorsI(int sugar, int calories){

        super();
    }


    FlavorsI(){
    }


    public static void main(String[] args) {

        Icecream ice = new Icecream();

        ice.flavor("chocolate");

    }

    @Override
    public double cost(double a) {
        return a*.2;
    }

    @Override
    void Outcome() {
        System.out.println("This is Flavor");
    }
}
