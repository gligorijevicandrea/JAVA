package class8;

public class NestedLoop7 {
    public static void main(String[] args) {

        /*
         0 1 2 3 4 5
         1 2 3 4 5
         2 3 4 5
         */

        for (int i = 0; i < 3; i++) {      // 3 lines of code
            for (int j = i; j <=5; j++) {    //  numbers from 0 to 5
                System.out.print(j+" ");   // space after each number
            }
            System.out.println();
        }

















    }
}
