package homework_5;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        /*
        3) Write a program that reads a range of integers (start and end point),
         provided by a user and then from that range prints the sum of the even and odd integers.

         */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter start point");
        int start = input.nextInt();
        System.out.println("Please enter end point");
        int end = input.nextInt();


        int even = 0;
        int odd = 0;

        if (start < end) {
            for (int a = start; a < end; a++) {

                if (a%2==0) {
                    even+=a;
                }else{
                    odd+=a;
                }
            }
            System.out.println("sum of even numbers " +even);
            System.out.println("sum of odd numbers " +odd);
        }else{
            for (int a = start; a >= end; a--) {
                if(a%2==0){
                    even+=a;
                }else{
                    odd+=a;
                }
            }
            System.out.println("sum of even numbers " +even);
            System.out.println("sum of odd numbers " +odd);
        }
        }
    }