package vazno.StringBuilder;

import java.util.Scanner;

public class Reverse {

    /*
    Write code that will take in a String input and check to see if it is a palindrome or not.
     */
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String givenString = inp.nextLine();
        //write your code below


        StringBuilder sb=new StringBuilder(givenString);
        sb.reverse();
        String rev=sb.toString();
        if(givenString.equals(rev)){
            System.out.print("true");
        }else{
            System.out.print("false");
        }

    }
}
