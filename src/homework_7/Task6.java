package homework_7;

public class Task6 {
    public static void main(String[] args) {

        //  Write a program to swap 2 numbers without a temporary variable?


        int [] numbers={2,4,6,8,10};

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]+" ");
        }

        System.out.println();
        numbers[4]=3;
        numbers[0]=1;

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]+" ");
        }



















    }
}
