package Homeworks.homework_3;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {

        /* Using scanner class create calculator.
        Allow user to enter 2 numbers and operator(+,-,*,/).
        Based on operator provide the result to user.
         */

        Scanner calculator=new Scanner(System.in);

        System.out.println("Please enter 2 numbers");

        int num1=calculator.nextInt();
        int num2=calculator.nextInt();

        System.out.println("Please choose operator");
        char operator=calculator.next().charAt(0);

        switch (operator){
            case '+':
                System.out.println(num1+" + "+num2+" = "+(num1+num2));
                break;
            case '-':
                System.out.println(num1+" - "+num2+" = "+(num1-num2));
                break;
            case '*':
                System.out.println(num1+" * "+num2+" = "+(num1*num2));
                break;
            case '/':
                System.out.println(num1+" / "+num2+" = "+(num1/num2));

        }

        calculator.close();












    }
}
