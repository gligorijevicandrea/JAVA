package homework_3;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {

        /* Write a program to find largest number among three numbers using nested if
        provided by a user (numbers must be distinct)
         */

        Scanner input=new Scanner(System.in);

        System.out.println("Please enter 3 distinct numbers");

        int num1=input.nextInt();
        int num2= input.nextInt();
        int num3=input.nextInt();

        if(num1>num2 && num1>num3) {
            System.out.println("The largest number is " + num1);

        }else  if(num2>num1 && num2>num3){
                System.out.println("The largest number is "+num2);
        }else{
                System.out.println("The largest number is "+num3);
        }




     input.close();







    }
}
