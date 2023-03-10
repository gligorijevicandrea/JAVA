package Homeworks.homework_7;

public class Task8 {
    public static void main(String[] args) {

        //  Write a Java Program to print the first 10 numbers of Fibonacci series.

        int maxNumber = 10;
        int previousNumber = 0;
        int nextNumber = 1;

        for (int i = 1; i < 10; i++) {

            System.out.print(previousNumber+" ");

            int sum=previousNumber+nextNumber;

            previousNumber=nextNumber;

            nextNumber=sum;


        }
        System.out.println();
        System.out.println("********************");



        int maxNumber1 = 10, previousNumber1 = 0, nextNumber1 = 1;


        int i=1;
        while(i <= maxNumber1)
        {
            System.out.print(previousNumber1+" ");
            int sum1 = previousNumber1 + nextNumber1;
            previousNumber1 = nextNumber1;
            nextNumber1 = sum1;
            i++;
        }









    }
}
