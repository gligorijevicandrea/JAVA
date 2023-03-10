package Homeworks.homework_3;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {

        /* Allow user to enter grade and then provide explanation:
        A-Excellent, B-Good, C-Average, D-Bad, any other grade --> Not Acceptable.
         At the end your program should print which grade was entered by a user with explanation.
         */

        Scanner input=new Scanner(System.in);
        System.out.println("Please enter the grade");
        char grade=input.next().charAt(0);

        switch (grade){
            case 'A':
                System.out.println("Grade "+grade+" is Excellent");
                break;
            case 'B':
                System.out.println("Grade "+grade+" is Good");
                break;
            case 'C':
                System.out.println("Grade "+grade+" is Average");
                break;
            case 'D':
                System.out.println("Grade "+grade+" is Bad");
                break;
            default:
                System.out.println("Not Acceptable");

        }

        input.close();



    }
}
