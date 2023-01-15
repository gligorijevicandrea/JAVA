package homework_5;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        /*
        4) Write a program to ask a user to enter item they want to buy and the price of that item.
        Every time user enters money accumulate the amount and tell the user how much is left to pay off.
        If user give more money program should return a change.
         Whenever a user done with payments program should say "Thank you for shopping!"
         */

        Scanner input=new Scanner(System.in);
        System.out.println("Enter item you want to buy");
        String item= input.next();
        System.out.println("Enter the price of your item");
        int price=input.nextInt();

        int computer=1000;

        if(item.equalsIgnoreCase("Computer")) {

                if (price < computer) {
                    System.out.println("please add " + (computer - price) + "$ more");
                } else if (price > computer) {
                    System.out.println("there you go your change of " + (price - computer));
                } else   {
                    System.out.println("Thank you for your shopping");
                }
        }









    }
}
