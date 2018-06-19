package part_06.Exercise_1;

class Dessert {

    private int sugarpercup;
    private int caloriespercup;

    Dessert(int sugarpercup, int caloriespercup){

        this.sugarpercup = sugarpercup;
        this.caloriespercup = caloriespercup;
    }

    Dessert(){}


    public int getSugarpercup() {
        return sugarpercup;
    }

    public void setSugarpercup(int sugarpercup) {
        this.sugarpercup = sugarpercup;
    }

    public int getCaloriespercup() {
        return caloriespercup;
    }

    public void setCaloriespercup(int caloriespercup) {
        this.caloriespercup = caloriespercup;
    }

    public double cost(double a){

        return  a;
    }

    void Outcome(){

        System.out.println("This is Dessert");
    }






}


