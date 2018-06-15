package part_03;


/**
 * Implement the getMonthName() method
 */

class Exercise_03  {

    public static void main(String[] strings) {


        // use a for loop to iterate 1000 times
        for (int i = 0; i < 1000; i++) {

            // Generate a random int between >= 1 and <= 12
            int month = 1 + (int) (Math.random() * ((12 - 1) + 1));

            // call getMonthName(int month) and pass your random int
            String monthName = getMonthName(month);

            // print the name of the month and the random int generated to the console
            System.out.println(month + " " + monthName);

        }

    }

    // Get the name for the month using the random int you generated
    public static String getMonthName(int month) {

        String monthName = "";

        switch (month) {

            case 1:
                System.out.println("Jan");
                break;
            case 2:
                System.out.println("Feb");
                break;
            case 3:
                System.out.println("Mar");
                break;
            case 4:
                System.out.println("Apr");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("Jun");
                break;
            case 7:
                System.out.println("Jul");
                break;
            case 8:
                System.out.println("Aug");
                break;
            case 9:
                System.out.println("Sep");
                break;
            case 10:
                System.out.println("Oct");
                break;
            case 11:
                System.out.println("Nov");
                break;
           default:
               System.out.println("Dec");
        }
        // use a switch statement to determine the name of the month
        // for instance if the random int is 1 the name of month is January

        return monthName;
    }
}





