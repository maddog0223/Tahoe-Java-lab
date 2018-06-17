package part_04;



/**

Implement, and populate a non-circular, consumptive queue (once a value has been retrieved
it cannot be retrieved again) of integers 0 through 100. Then print out every other
value in the queue.

expected output: 0,2,4,6,8.....100

*/

class Queue {

    private int[] queen;

    private int putloc, getloc;


    public Queue(int size) {

        queen = new int[size];

        putloc = 0;
        getloc = 0;
    }


    public static void main(String[] args) {

        Queue objq = new Queue(100);

        for (int i = 0; i <= objq.queen.length; i++){

            if (i%2==0){

                objq.getPutloc(i);
                }
        }

        for (int g = 0; g <= objq.queen.length; g++){

            System.out.println(objq.Getloc());
        }

    }


    void getPutloc(int num) {

        if (putloc == queen.length) {

            System.out.println("IT'S FULL!!");

            return;
        }

        queen[putloc++] = num;
    }


    int Getloc() {

        if (getloc == putloc) {

            System.out.println("It'S EMPTY");

            return -1;
        }

        return queen[getloc++];


    }

}