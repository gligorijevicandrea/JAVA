package vaznoArrays;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {

        /* Write a program that creates a String array with size 7.

        Ask the user to input Days of a week beginning with Sunday using Scanner class.

        Add these inputs to your array and then print all values from that array

        Example:

        Please enter day 1 of the week

        Sunday

        Please enter day 2 of the week

        //Monday */

        String [] arr = new String[7];
        System.out.println("Enter the days of the week");
        Scanner sc = new Scanner(System.in);
        for(int i =0;i<7;i++) {
            String input = sc.next();
            arr[i]=input;
        }
        for(int j =0;j<arr.length;j++) {
            System.out.println(arr[j]+" ");
        }








    }











}

