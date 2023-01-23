package homework_9;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

       /* Write a program that reads two people's first
          names and if they expecting boy or girl?
          Based on the input suggests a name for a baby:
          Example Output:
          Mom’s first name? Mary
          Dad’s first name? Daniel
          Boy or Girl? boy
          Suggested baby name: DANRY

         Example Output:
         Mom’s first name? Mary
         Dad’s first name? Daniel
         Boy or Girl? girl
         Suggested baby name: MAIEL */

        Scanner scan=new Scanner(System.in);

        System.out.println("Please enter mom's name");
        String mom=scan.next();
        System.out.println("Please enter dad's name");
        String dad=scan.next();
        System.out.println("Are you expecting boy or a girl?");
        String baby=scan.next();

        if(baby.equalsIgnoreCase("boy")){
            System.out.println(dad.substring(0,3).concat(mom.substring(2)).toUpperCase());
        } else if (baby.equalsIgnoreCase("girl")) {
            System.out.println(mom.substring(0,2).concat(dad.substring(3)).toUpperCase());
        }


    }
}
