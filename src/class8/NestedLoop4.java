package class8;

public class NestedLoop4 {
    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {    // outer for loop   3 lines prints

            for (int j = 0; j < 5; j++) {    // inner loop

                if (j == 1 || j == 2) {
                    System.out.print(" ");
                }else {
                    System.out.print("*");
                }
            }
            System.out.println(); //
        }






    }
}
