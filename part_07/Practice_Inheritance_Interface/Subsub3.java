package part_07.Practice_Inheritance_Interface;

import part_07.Practice_Inheritance_Interface.Model;

class Type extends Model {

    Type(String roomtype) {

        super(roomtype);
    }

    private int carpettotileratio;

    public String Dmaterial(String doormaterial) {

        super.Doors(2);

        doormaterial = "wood";

        return doormaterial;
    }

    public String Kitchenfloor(String floor) {

        super.Room1("Kitchen");

        floor = "tile";

        return floor;
    }

    public String Livingroomfloor(String floorL) {

        super.Room3("Livingroom");

        floorL = "carpet";

        return floorL;
    }

    int carptotile(int carpettotileratio) {

        this.carpettotileratio = carpettotileratio;

        return carpettotileratio;

    }

}
