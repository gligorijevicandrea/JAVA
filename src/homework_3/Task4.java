package homework_3;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        /* Write a program for user to enter his/hers birth month. Based on the month define the season.
           Example: if user is born in June, July or August → season =”Summer”.
           At the end of the program we should see output as “You were born __”. */

        Scanner input=new Scanner(System.in);
        System.out.println("Please enter yours birth month");
        String month=input.next();

       switch(month){
           case "January":
               System.out.println("Winter");
               break;
           case "February":
               System.out.println("Winter");
               break;
           case "March":
               System.out.println("Spring");
               break;
           case "April":
               System.out.println("Spring");
               break;
           case "May":
               System.out.println("Spring");
               break;
           case "June":
               System.out.println("Summer");
               break;
           case "July":
               System.out.println("Summer");
               break;
           case "August":
               System.out.println("Summer");
               break;
           case "September":
               System.out.println("Autumn");
               break;
           case "October":
               System.out.println("Autumn");
               break;
           case "November":
               System.out.println("Autumn");
               break;
           case "December":
               System.out.println("Winter");
               break;

        }

        System.out.println("You were born "+month);

       input.close();








    }
}
