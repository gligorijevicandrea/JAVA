package class5;

import java.util.Scanner;

public class DistinctiveNumbers {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Please enter 3 distinct numbers");

        int num1=input.nextInt();
        int num2=input.nextInt();
        int num3=input.nextInt();

        if(num1>num2){
            if(num1>num3){
                System.out.println("The largest number is "+num1);
            }
        }

        if(num2>num1){
            if(num2>num3){
                System.out.println("The largest number is "+num2);
            }
        }

        if(num3>num2){
            if(num3>num2){
                System.out.println("The largest number is "+num3);
            }
        }

    }
}
