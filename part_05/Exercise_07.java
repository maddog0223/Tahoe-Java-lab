package part_05;

import javax.sound.midi.Soundbank;

/**
 * Write two classes. Class_01 should have the main(). Class_02 should have various instance variables. At least one of
 * must be static. Within class_01 create at least 3 instances of class_02. Set the instance variables of class_02. Then,
 * just once, in one place, set the static instance variable in class_02. Afterwards, print out the value of each instance
 * variable and the static variable for each class.
 */

class Animal{


    public static void main(String[] args) {

        Types animal1 = new Types();
        Types animal2 = new Types();


        animal1.setType("Dog");
        animal1.setWord("Woof");
        Types.setTotal(3);

        System.out.println(animal1.getType()+ " " + animal1.getWord() + " " + Types.getTotal());

        animal2.setType("Sheep");
        animal2.setWord("BAHAAAA");
        Types.setTotal(5);
        System.out.println();

        System.out.println(animal2.getType()+ " " + animal2.getWord() + " " + Types.getTotal());
        System.out.println();

        Types.setTotal(8);

        System.out.println("Total " + Types.getTotal());



    }


}

class Types{

    private  String Word;
    private  String type;
    static int total;

    public String getWord() {
        return Word;
    }

    public void setWord(String word) {
        Word = word;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public static int getTotal() {
        return total;
    }

    public static void setTotal(int total) {
        Types.total = total;
    }


    static void Total(){

        int t = getTotal();
        System.out.println(t);
    }
}

class BaseballTeams {

    private String league;
    private char division;
    static int numOfPlayers;

    public String getLeague() {
        return league;
    }

    public void setLeague(String league) {
        this.league = league;
    }

    public char getDivision() {
        return division;
    }

    public void setDivision(char division) {
        this.division = division;
    }

    public static int getNumOfPlayers() {
        return numOfPlayers;
    }

    public static void setNumOfPlayers(int numOfPlayers) {
        BaseballTeams.numOfPlayers = numOfPlayers;
    }
}


class TeamConstructor {

    public static void main(String[] args) {

        BaseballTeams blueJays = new BaseballTeams();
        BaseballTeams indians = new BaseballTeams();
        BaseballTeams reds = new BaseballTeams();
        BaseballTeams rockies = new BaseballTeams();


        blueJays.setDivision('E');
        blueJays.setLeague("AL");

        indians.setLeague("AL");
        indians.setDivision('C');

        reds.setLeague("NL");
        reds.setDivision('C');

        rockies.setLeague("NL");
        rockies.setDivision('W');

        BaseballTeams.numOfPlayers=32;

        System.out.println("The Blue Jays have " + " " + BaseballTeams.numOfPlayers + " " + "players");
        System.out.println("The Blue Jays are in the" + " " + blueJays.getLeague());


    }

}