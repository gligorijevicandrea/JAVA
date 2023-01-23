package vazno.vaznoArrays;

import java.util.Scanner;

public class Arrays2 {
    public static void main(String[] args) {

        /* Create an array of integers that will store 5 elements taken from a user

Don't print any prompt message for the user

Then print out all the elements you have created in the first loop in reverse order.  */


        int[]arr=new int[5];

        Scanner scanner=new Scanner(System.in);

        for(int i=0; i<5; i++){

            int input=scanner.nextInt();
            arr[i]=input;
        }

        for(int k=4; k>=0; k--){
            System.out.println(arr[k]);
        }








    }
}
