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

        for (int i = 1; i <7 ; i++) {
            System.out.println("*");
        }
        System.out.println();
        System.out.println();
        for (int i = 0; i < 5; i++) {
            if (i == 1 || i == 2){
                System.out.println(" ");
                System.out.println();
            }else{
                System.out.println("*");
            }
        }









    }
}
