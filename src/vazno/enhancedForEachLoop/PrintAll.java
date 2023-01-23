package vazno.enhancedForEachLoop;

public class PrintAll {
    public static void main(String[] args) {


        // to print all elements from matrix using ENHANCED/FOR EACH LOOP from 2D array

        int [][] matrix={ {10,20,30},
                {45,55,66},
                {30,40,20,10,25},

        };

        for(int[] arr:matrix){

            for(int number:arr){
                System.out.print(number+" ");
            }
            System.out.println();

        }
















    }
}
