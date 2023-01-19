package class11;

public class OddNumbersIn2DArraysPrintLoop {
    public static void main(String[] args) {

        // to print all odd numbers from matrix using loop

        int [][] matrix={ {10,20,30},
                {45,55,66},
                {30,40,20,10,25},

        };


        for (int i = 0; i < matrix.length; i++) {      // 3 rows for matrix.length

            for (int j = 0; j < matrix[i].length; j++) {    //  different numbers of elements in each row so we use [i]

                if(matrix[i][j]%2!=0){                       // print odd numbers
                    System.out.print(matrix[i][j] + " ");
                }

            }
            System.out.println();
        }










    }
}
