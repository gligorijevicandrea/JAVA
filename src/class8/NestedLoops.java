package class8;

public class NestedLoops {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {    // outer for loop

            for (int j = 0; j < 5; j++) {   // inner for loop
                System.out.println(j);   //  This line of code will be repeated 5 times
            }
            System.out.println("***********************"); // we add this inside of outer loop prints out 5 times

        }













    }
}
