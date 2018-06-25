package part_10.ExPackage;

import java.util.Scanner;

public class ExThread extends Thread{

    public ExThread(String name){

        super(name);

        start();

    }

    @Override
    public void run(){


        for(int i = 0; i < 4; i++){

            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


            System.out.println(getName() + "This is number " + i);
        }

        end();
    }
    public void end(){

        System.out.println("Done");
    }



}
