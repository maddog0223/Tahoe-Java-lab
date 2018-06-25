package part_09.Excercise_1;

public class Ch11Q8 {

    String state;

    synchronized void tick(boolean running) {

        if (!running) {

            state = "ticked";
            notify();
            return;
        }

        System.out.println("Tick");

        try {
            Thread.sleep(500);
        } catch (InterruptedException ie) {

            System.out.println("Thread interrupted");
        }

        state = "ticked";

        notify();

        try {

            while (!state.equals("tocked")) {
                wait();
            }
        } catch (InterruptedException ie) {

            System.out.println("Error: Interrupted " + ie);
        }
    }


    synchronized void tock(boolean running) {

        if (!running) {

            state = "tocked";
            notify();
            return;
        }
        System.out.println("Tock");

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        state = "tocked";

        notify();
        try {

            while (!state.equals("ticked")) {

                wait();
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}