package part_10.RunaableThreadPack;

import org.omg.PortableServer.THREAD_POLICY_ID;

public class RunnableClass implements Runnable {

    Thread thread;

    public RunnableClass(String name){
        thread = new Thread(this,name);
        thread.start();

    }

    @Override
    public void run() {
        //code code code ...

    }
}
