package class5;

import java.util.Scanner;

public class ScannerDemo1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);


        /*System.out.println("Please enter your age");
        int age= scan.nextInt();
        System.out.println("You are "+age+" years old");

        System.out.println("Please enter your weight");
        double weight=scan.nextDouble();
        System.out.println(" your weight is "+weight+" lbs");
        System.out.println("Are you hungry");
        boolean hungry=scan.nextBoolean();
        System.out.println("Hungry "+hungry);*/

       /* System.out.println("Please enter your gender");
        char gender=scan.next().charAt(0);
        System.out.println("Your gender is "+gender);*/

        System.out.println("Please enter your name");
        String name=scan.next(); // when we want to take just one word as input we use .next();
        System.out.println("Your name is "+name);


        scan.nextLine(); // we need to add this extra line of scan.nextLine(); to input your full name
        System.out.println("Please enter your full name");
        String fullName=scan.nextLine();
        System.out.println("Your full name is "+fullName);
        scan.close(); // good practise to use it
    }
}
