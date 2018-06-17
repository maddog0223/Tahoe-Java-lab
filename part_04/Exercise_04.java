package part_04;

/**
 *
 */

class Exercise_04 {
    public static void main(String[] args) {
        int[][] dataArray = {
                {12, 45, 67},
                {8, 4, 13, -43, 98},
                {567, 1, 0, -2},
                {18, -456, 14, 6, 48, -80}
        };
        // uncomment the lines below when your methods are ready
        System.out.println("The max is " + getMaxVal(dataArray));
        System.out.println("The min is " + getMinVal(dataArray));
    }

    // write a method called getMaxVal that takes in a 2D array and iterates through the array to determine the max value in array
    public static int getMaxVal(int[][] data) {
        int maxv = data[0][0];

        for (int a = 0; a < data.length; a++) {
            for (int b = 0; b < data[a].length; b++) {

                if (maxv < data[a][b]) {

                    maxv = data[a][b];
                }

            }

        }

        return maxv;
    }
//
//
//}
    // write a method called getMinVal that takes in a 2D array and iterates through the array to determine the min value in array
public static int getMinVal(int[][] data) {

    int minv = data[0][0];

    for (int a = 0; a < data.length; a++) {

        for (int b = 0; b < data[a].length; b++) {

            if (data[a][b] < minv) {

                minv = data[a][b];

            }

        }

    }
    return minv;

    }

}