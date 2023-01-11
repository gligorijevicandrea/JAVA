package homework_3;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        /*  Ask user to enter their country and capture it.
        Once values are captured print which language user speaks.
         */

        Scanner input=new Scanner(System.in);
        System.out.println("Where are you from?");

        String country=input.next();

        switch (country){
            case "Germany":
                System.out.println("german");
                break;
            case "USA":
                System.out.println("english");
                break;
            case "France":
                System.out.println("french");
                break;
            case "Poland":
                System.out.println("polish");
                break;
            case "Norway":
                System.out.println("norwegian");

        }

     input.close();





    }
}
