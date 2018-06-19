package part_07.Practice_Inheritance_Interface;


class House extends Building {

    House(String doors, String windows, String rooms){

        super(doors, windows, rooms);
    }

    House(String room){

        super(room);
    }

    private int housesize;


    public int Rooms(int rooms){

        super.setRooms(6);

        return rooms;
    }

    public int Doors(int doors){

        super.setDoors(3);

        return doors;
    }

    public int Windows(int windows){

        super.setWindow(10);

        return windows;
    }

    int Hsize(int housesize){

        this.housesize = housesize;

        return housesize;
    }






}
