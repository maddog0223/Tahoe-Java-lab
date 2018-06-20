package part_08.Exception_Practice;

public class QueueException {


        private int[] queue;
        private int getloc,putloc;

        QueueException(int size){

            queue = new int[size];

            getloc = putloc = 0;
        }


        void put(int number) throws ItsFullEmptyException{

            if (putloc == queue.length){

               throw new ItsFullEmptyException("Exception Full!");

            }

            queue[putloc++] = number;

        }

        int get() throws ItsFullEmptyException{

            if (getloc ==putloc){


                throw new ItsFullEmptyException("It's Empty Exception");
            }

            return queue[getloc++];

        }

        public static void main(String[] args) throws ItsFullEmptyException {

            QueueException obj = new QueueException(10);

            for (int p =0; p <= obj.queue.length-1; p++){

                obj.put(p);

            }

            for (int g = 0;  g <= obj.queue.length; g++){


                System.out.println(obj.get());
            }


        }

}
