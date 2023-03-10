package Homeworks.homework_7;

public class Task3 {
    public static void main(String[] args) {

         //  Create a 2D array of integer values. Print the sum of all numbers.


        int [][] matrix={ {10,20,30},
                          {45,55,66},
                          {30,40,25},

        };



        int sum=0;
        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {

            sum=sum+matrix[i][j];
            }

            System.out.println();  // adding space between rows
        }

        System.out.println(sum);






    }
}
