package part_05;



/**
 * Write two classes. In Class_01 (which contains the main()) create an instance of Class_02 and pass that instance
 * to a method_01 within Class_01. Within method_01 you must manipulate several private instance variables within
 * Class_02. Then, from within method_01, pass the instance of Class_02 to a new method, method_02. Within method_02
 * modify the instance variables of Class_02 once again. Use System.out.println at various points to demonstrate the
 * flow of execution and the varying state of each private variable. You can name these classes whatever you want.
 *
 */

class Game{

    public static void main(String[] args) {

        Players firstplay = new Players();

       firstplay.setPlayer1("handling");
       firstplay.setPlayer2("cuttng");
       firstplay.setPlayer3("cutting");

      firstplay.game1();

        firstplay.setPlayer1("cutting");
        firstplay.setPlayer2("handling");
        firstplay.setPlayer3("switched");

        System.out.println();
        firstplay.game2();
    }




}


class Players{

    private String player1;
    private String player2;
    private String player3;


    public String getPlayer1() {
        return player1;
    }

    public void setPlayer1(String player1) {
        this.player1 = player1;
    }

    public String getPlayer2() {
        return player2;
    }

    public void setPlayer2(String player2) {
        this.player2 = player2;
    }

    public String getPlayer3() {
        return player3;
    }

    public void setPlayer3(String player3) {
        this.player3 = player3;
    }


    public void game1(){


        System.out.println("player 1 is " + getPlayer1() + " player 2 is " + getPlayer2() + " player 3 is " + getPlayer3() );


    }

    public void game2(){

        System.out.println("player 1 is now " + getPlayer1() + " player 2 is now " + getPlayer2() + " player 3 is now " + getPlayer3() );
    }
}