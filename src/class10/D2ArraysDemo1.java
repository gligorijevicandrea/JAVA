package class10;

public class D2ArraysDemo1 {
    public static void main(String[] args) {


        int [][] matrix={ {10,20,30},
                {45,55,66},
                {30,40,20,10,25},


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
