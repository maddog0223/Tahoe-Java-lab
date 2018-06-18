package part_05;

/**
 * Demonstrate how variable-arity works, aka varargs. Create a method that uses "String ... varargs". Within the
 * varargs method, use StringBuilder to build a nicely formatted String/sentence using the varargs. Print this statement
 * to the console. Do this at least 3 times with different Strings/sentences.
 */


class MethStr {

    public static void main(String[] args) {

        MethStr obj = new MethStr();

        System.out.println(obj.varargs());

    }

    public String varargs(String... Strings) {

        StringBuilder sb = new StringBuilder();

        sb.append("Hello! ").append(" my ").append(" name ").append(" is ").append(" Madoka ");

        return sb.toString();


    }

}

class Ex2 {
    public static void main(String[] args) {
        Ex2 obj = new Ex2();

        obj.sb2("This is the first sentence");
        obj.sb2("This is the second");
        obj.sb2("What uppp");

    }


    public void sb2(String... sentence) {

        System.out.println();

        for (String a : sentence) {


            System.out.println(a);
        }

    }
}
