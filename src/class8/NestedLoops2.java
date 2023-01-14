package class8;

public class NestedLoops2 {
    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {    // outer for loop   3 lines prints

            for (int j = 0; j < 7; j++) {   // inner for loop
                System.out.print("* ");   //   7 stars  prints
                System.out.println(); //
            }


        }
    }
}
