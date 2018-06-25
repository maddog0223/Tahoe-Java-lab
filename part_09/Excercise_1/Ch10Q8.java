package part_09.Excercise_1;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class Ch10Q8{

    public static void main(String[] args){

        int i;

        if (args.length != 2){

            System.out.println("Usage: copy file from to");
            return;
        }


        args[0] = "/home/pandydog1/Documents/CodingNomads/example.txt";
        args[1] = "/home/pandydog1/Documents/CodingNomads/example.txt";


        try(FileReader fr = new FileReader(args[0]); FileWriter fw = new FileWriter(args[1])) {

            do {
                i = fr.read();
                if ((char) i == ' ') i = '-';

                if (i != -1)
                    fw.write(i);

            }while (i != -1);

        }catch (IOException ie){

            System.out.println("Error" + ie);
        }
    }


}
