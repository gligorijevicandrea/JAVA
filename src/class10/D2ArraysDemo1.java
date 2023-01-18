package class10;

public class D2ArraysDemo1 {
    public static void main(String[] args) {

        int [][] matrix={ {10,20,30},
                          {55,22,45},
                          {100,220,450},
        };


       //    System.out.println(matrix[1][1]);   // prints out 22

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {

                System.out.println(matrix[i][j]+" ");   // prints out all values for rows and columns
            }

            System.out.println();  // adding space between rows
        }






    }
}
