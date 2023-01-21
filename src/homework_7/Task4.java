package homework_7;

public class Task4 {
    public static void main(String[] args) {

        // Create a 2D array or integer type where you will store odd and even numbers.
        // Develop a program which will identify/print the even numbers only.

            int [][] matrix={ {10,15,20},
                              {25,30,40},
                              {45,50,55},
            };

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                if (matrix[i][j] % 2 == 0) {
                    System.out.println(matrix[i][j]);
                }

            }




        }









    }
}
