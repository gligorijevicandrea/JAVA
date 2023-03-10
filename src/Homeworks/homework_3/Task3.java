package Homeworks.homework_3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        /*  Write a program that will read three inputs of scores (quiz, mid term, and final scores)
         and determine the grade based on the following rules:
         if the average score >=90 → grade=A
         if the average score >= 70 and <90 → grade=B
         if the average score>=50 and <70 → grade=C
         if the average score<50 → grade=F */

        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your quiz");
        int quiz=input.nextInt();
        System.out.println("Please enter your mid term");
        int midTerm=input.nextInt();
        System.out.println("Please enter your final scores");
        int finalScores=input.nextInt();

        int average=(quiz+midTerm+finalScores)/3;

        System.out.println("Your average score is "+average);

        if(average>=90){
            System.out.println("A");
        } else if (average>=70 && average<90) {
            System.out.println("B");
        }else if(average>=50 && average<70){
            System.out.println("C");
        }else if(average<50){
            System.out.println("F");
        }


    }
}
