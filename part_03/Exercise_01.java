package part_03;

/**
Write 3 classes. These classes can reside in the same file for ease and clarity.
The first class (the controller) should have at least two methods, one of which being a main method.
The main method needs to utilize constructors to create at least two separate objects. Each class must
have at least 3 variables all 3 variables in each class must be used and set. Think about the Vehicle
objects we have discussed in class. A vehicle has a make, model, MPG, 2/4 doors, color etc. Do not use a
Vehicle object in this exercise :)

Be creative. Have some fun. Using Java objects you can model just about anything you want. Cars, animals, poker games,
sports teams, trees, beers, people and so on.

**/

class FruitController{



public static void main(String[] args) {

    Fruits fruits = new Fruits();
    Watermelon w = new Watermelon("rough","reen in red", 7);


}




}


class Fruits{
String texture;
String color;
int sweetnessrate ;

Fruits(String texture, String color, int sweetnessrate){

    this.texture = texture;
    this.color = color;
    this.sweetnessrate = sweetnessrate;

}

Fruits(){}

}

class Watermelon extends Fruits {


Watermelon ( String texture, String color, int sweetnessrate){
    super(texture, color, sweetnessrate);
}


}