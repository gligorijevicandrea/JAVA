package Homeworks.homework_7;

public class Task7 {
    public static void main(String[] args) {

        //  Write a java program to check whether a given number is prime or not?

        boolean isPrime=true;
        int num=37;
        int i=2;
        for (int j = 2; j <=num/2 ; j++) {

            if(num % i == 0) {
                isPrime = false;
                break;
            }

        }
        if(isPrime)
            System.out.println(num + " is a Prime Number");
        else
            System.out.println(num + " is not a Prime Number");






    }
}
