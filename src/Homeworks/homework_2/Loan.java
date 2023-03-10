package Homeworks.homework_2;

import java.util.Scanner;

public class Loan {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("How much money do you need?");

        int loanAmount=input.nextInt();

        if(loanAmount<=200000){
            System.out.println("We will lend you the money");
        }else{
            System.out.println("Client rejected");
        }

    }
}
