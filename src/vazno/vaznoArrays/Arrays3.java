package vazno.vaznoArrays;

import java.util.Scanner;

public class Arrays3 {
    public static void main(String[] args) {

        /* Create an int array of integers with a size of 5 and input values with Scanner.

Don't print prompt questions for a user.

Using loop print out each element of the array that should look like the output below */

        int[]arr=new int[5];

        Scanner scanner=new Scanner(System.in);

        for(int i=0; i<5; i++){
            int input=scanner.nextInt();
            arr[i]=input;

        }

        for(int j=0; j<5; j++){
            System.out.println(arr[j]*10);

        }






    }
}
