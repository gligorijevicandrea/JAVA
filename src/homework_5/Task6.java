package homework_5;

public class Task6 {
    public static void main(String[] args) {

        /*
        6) Print the following pattern:
          *

          *

          *
          **
          *
          **
          *

         */

        for (int i = 1; i < 10; i++) {
            if (i <= 5) {
                if (i % 2 != 0) {
                    System.out.println("*");
                } else {
                    System.out.println();
                }
            }
            if (i > 5) {
                if (i % 2 == 0) {
                    System.out.println("**");
                } else {
                }
                System.out.println("*");

            }

        }




    }
}
