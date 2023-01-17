package homework_5;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        /*
        3) Write a program that reads a range of integers (start and end point),
         provided by a user and then from that range prints the sum of the even and odd integers.

        */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter 2 numbers starting point and ending point");
        int start=scanner.nextInt();
        int end= scanner.nextInt();

        System.out.println("start "+start+" end "+end);

        int evenSum=0;
        int oddSum=0;

        for (int i = start; i <=end; i++) {
            if(i%2==0){
                evenSum+=i;  // same as evenSum=evenSum+i;  // we are adding all even numbers
            }else {
                oddSum = oddSum + i; // same se oddSum+=i;

            }
        }

        System.out.println("Sum of all the Even Numbers "+evenSum);
        System.out.println("Sum of all the Odd Numbers "+oddSum);









        }
    }