package homework_2;

import java.util.Scanner;

public class CreditCard {
    public static void main(String[] args) {
        Scanner credit = new Scanner(System.in);

        System.out.println("Do you have a credit card?");

        boolean creditCard = credit.nextBoolean();

        if (creditCard) {
            System.out.println("What's the balance on the card?");

            int balance = credit.nextInt();

            if (balance > 1000) {
                System.out.println("Pay off immediately");
            } else {
                System.out.println("You can spend more");
            }

        } else {
            System.out.println("We can offer you a credit card");
        }
    }
}