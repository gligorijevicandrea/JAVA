package class8;

public class NestedLoops3 {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {    // outer for loop
            for (int j = 0; j < 7; j++) {
                if (j == 1 || j == 2) {
                    continue;
                }
                System.out.print("* ");
            }
            System.out.println(); //
        }






    }
}
