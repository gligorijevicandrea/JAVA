package Homeworks.homework_7;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        // 1)Using Scanner create an array of integer values.
        // After the array is created, calculate the sum of all stored elements in that array.

        Scanner scan=new Scanner(System.in);

        int[]arr=new int[5];
        int sum=0;
        for(int i=0; i<5; i++){

            int input=scan.nextInt();
            arr[i]=input;
            sum=sum+input;

        }
        System.out.println(sum);







    }
}
