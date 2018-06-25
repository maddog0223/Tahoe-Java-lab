package part_10.RunaableThreadPack;

public class Controller {

    public static void main(String[] args) {

        System.out.println("starting main thread...");

        ThreadClass t1 = new ThreadClass("thread-1");
        ThreadClass t2 = new ThreadClass("thread-2");
        ThreadClass t3 = new ThreadClass("thread-3");



//       you can call start in here like below, or the constructors from the thread class (which what this class is doing)
//        t1.start();
//        t2.start();
//        t3.start();

//        try {
//
//            t1.join();
//
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

    }
}
