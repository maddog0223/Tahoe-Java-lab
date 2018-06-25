package part_10.RunaableThreadPack;

public class ThreadClass extends Thread{


    // Constructor

    public ThreadClass(String name){

        super(name);
        //The thread class/object calls you run() after you call start()
        start();
    }


    //whatever is in the run() is what will execute on the thread
    @Override
    public void run(){

        //looping few times - sleeping on each loop to mimic a process taking some time
        for (int i = 0; i < 5; i++){
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


            //print name and count
            System.out.println(getName() + " is on count " + i);
        }

        //demonstrate calling another method from with run()
        example(getName());
    }


    //this example just shows that not all of your has to be in the run method. Do whatever you want
    public void example(String name){

        System.out.println("example" + name);
        System.out.println("main thread complete");
    }

}
