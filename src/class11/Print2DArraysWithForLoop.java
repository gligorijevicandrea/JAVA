package class11;

public class Print2DArraysWithForLoop {
    public static void main(String[] args) {

        // to print all elements from matrix using loop

        int [][] matrix={ {10,20,30},
                {45,55,66},
                {30,40,20,10,25},

        };


        for (int i = 0; i < matrix.length; i++) {      // 3 rows for matrix.length

            for (int j = 0; j < matrix[i].length; j++) {    //  different numbers of elements in each row so we use [i]
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }










    }
}
