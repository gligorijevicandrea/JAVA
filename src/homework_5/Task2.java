package homework_5;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        /*
        2) Create a program that will be asking user to apply for a credit card 10 times.
         As soon you get an “yes” from a user program should stop asking.
         */

        Scanner input=new Scanner(System.in);


        for (int i = 0; i < 10; i++) {
            System.out.println("Do you wanna apply for credit card?");

            boolean creditCard = input.nextBoolean();

            if (creditCard) {
                System.out.println("Thanks for offer");
            } else {
                System.out.println("Try next time");
            }
        }






    }
}
