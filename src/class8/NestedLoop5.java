package class8;

public class NestedLoop5 {
    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {    // outer for loop   3 lines prints

            if(i==1){         // prints 2 lines of stars for 1 and 2
                System.out.println();  // print empty line
                continue;
            }

            for (int j = 0; j < 5; j++) {    // inner loop prints 5 stars in same line

                System.out.print("*");
            }

            System.out.println();
        }















    }
}
