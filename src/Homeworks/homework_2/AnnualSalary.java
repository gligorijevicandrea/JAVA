package Homeworks.homework_2;

import java.util.Scanner;

public class AnnualSalary {
    public static void main(String[] args) {

        Scanner money = new Scanner(System.in);

        System.out.println("How many years do you work here?");

        int work = money.nextInt();

        if (work >= 5) {
            System.out.println("You are eligible for bonus");

            System.out.println("How much is your salary?");

            int salary = money.nextInt();

            if (salary > 50000) {
                System.out.println("You get a bonus of 5000");
            } else {
                System.out.println("You get a bonus of 3000");
            }


        } else {
            System.out.println("You are not eligible for bonus");


        }
    }
}
