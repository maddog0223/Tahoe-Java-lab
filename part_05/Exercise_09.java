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
