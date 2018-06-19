package part_07.Practice_Inheritance_Interface;

import part_07.Practice_Inheritance_Interface.Interface;

class Building implements Interface {

     Building(String door, String windows, String room){}
     Building(String room){}

     private int doors;
     private int window;
     private int rooms;


  public static void main(String[] args) {

      }

     public int getDoors() {
         return doors;
     }

     public void setDoors(int doors) {
         this.doors = doors;
     }

     public int getWindow() {
         return window;
     }

     public void setWindow(int window) {
         this.window = window;
     }

     public int getRooms() {
         return rooms;
     }

     public void setRooms(int rooms) {
         this.rooms = rooms;
     }


     @Override
     public void location() {

      location();
         System.out.println("Suburb");
     }

     @Override
     public void Cost(double cost) {

    Cost(cost);
         cost = 80567.00;
     }

     @Override
     public void BuildingAge() {

     }
 }

