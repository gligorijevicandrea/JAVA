package Homeworks.homework_6;

public class Task5 {
    public static void main(String[] args) {

        // 5) Create an array of size 5 on integers and calculate the sum of all elements in an array.

        int[]numbers={1,2,3,4,5};

        int sum=0;

        for (int i = 1; i <= numbers.length; i++) {
            sum=sum+i;
        }

        System.out.println(sum);









    }
}
