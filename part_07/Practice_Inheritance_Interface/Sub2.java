package part_07.Practice_Inheritance_Interface;

import part_07.Practice_Inheritance_Interface.House;

class Model extends House {

    Model(String roomtype) {

        super(roomtype);
    }


    private int roomsize;

    public String Room1(String room1){

        super.Rooms(1);

       room1 = "Kitchen";

        return room1;
    }

    public String Room2(String room2){

        super.Rooms(2);

        room2 = "Bedroom";

        return room2;
    }

    public String Room3(String room3){

        super.Rooms(1);


        room3 = "Livingroom";

        return room3;
    }

    public String Room4(String room4){

        super.Rooms(2);

        room4 = "Restroom";

        return room4;
    }

    void RoomSize(int roomsize ){

        this.roomsize = roomsize;
    }
}

