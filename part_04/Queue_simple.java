package part_04;

public class Queue_simple {

    private int[] queue;
    private int getloc,putloc;

    Queue_simple(int size){

        queue = new int[size];

        getloc = putloc = 0;
    }


    void put(int number){

        if (putloc == queue.length){

            System.out.println("It's Full");

            return;
        }

        queue[putloc++] = number;

    }

    int get(){

        if (getloc ==putloc){

            System.out.println("It's Empty");

            return -1;
        }

        return queue[getloc++];

    }

    public static void main(String[] args) {

        Queue_simple obj = new Queue_simple(10);

        for (int p =0; p <= obj.queue.length-1; p++){

            obj.put(p);

        }

        for (int g = 0;  g <= obj.queue.length; g++){


            System.out.println(obj.get());
        }

    }

}
