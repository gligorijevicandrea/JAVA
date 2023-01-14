package class8;

public class NestedLoop6 {
    public static void main(String[] args) {

       /*  1 2 3 4 5 
           1 2 3 4 5
           1 2 3 4 5
        */

        for (int i = 0; i <3; i++) {  // executes code 3 times , for 0 1 2

            for (int j = 1; j <=5; j++) {    // prints numbers 1 to 5
                System.out.print(j+" ");    // adds space after each number
            }
            System.out.println();   // prints one under another , goes inside first loop

        }











    }
}
