package homework_5;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        /*
        4) Write a program to ask a user to enter item they want to buy and the price of that item.
        Every time user enters price accumulate the price and tell the user how much total they should pay.
        If user give more money program should return a change.
         Whenever a user done with payments program should say "Thank you for shopping!"

         1: Scanner name : asks for item , Scanner asks for price
         2: Scanner String for item , Scanner int for price
         3: tells how much is the price of item
         4: If price user enters is bigger , he gets a change
         5: If price user enters is smaller , we ask him for more $$$
         */




            Scanner scanner = new Scanner(System.in);

            double totalPrice = 0;
            for (int i = 0; i < 3; i++) {  // // if we want user to be asked 2 times what to buy and for price , or while(true)

                System.out.println("Please Enter the item and its price");
                String itemName = scanner.next();
                double itemPrice = scanner.nextDouble();
                totalPrice = totalPrice + itemPrice;
                System.out.println("This is the totalPrice amount that you have to pay " + totalPrice);
            }

            System.out.println("Please pay for the items");
            double amountPaid = scanner.nextDouble();

            if (amountPaid > totalPrice) {
                double chang = amountPaid - totalPrice; // calculating the change
                System.out.println("Hey here is your change " + chang);
            } else if (amountPaid < totalPrice) {
                System.out.println("You can't buy all the items");
            }
            System.out.println("Thank you for shopping!");




    }
}
