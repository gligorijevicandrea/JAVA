package class11;

import java.util.Arrays;

public class PrintRows2DArray {
    public static void main(String[] args) {

        int [][] matrix={ {10,20,30},
                          {45,55,66},
                          {30,40,20,10,25},

         };


        System.out.println(matrix[2][4]);   // 2 is row , 4 is column
        System.out.println(Arrays.toString(matrix[0]));  // prints whole first row

        for (int i = 0; i < matrix[0].length; i++) {   // prints whole row
            System.out.println(matrix[0][i]);
        }

        System.out.println("******************************************************************************************************************");

        int[]arr=matrix[0];       // prints whole first row
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("******************");

        int[]arr1=matrix[2];
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr1[i]);
        }

        System.out.println(Arrays.toString(matrix[2]));









    }
}
