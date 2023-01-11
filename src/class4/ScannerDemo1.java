package class4;

import java.util.Scanner;

public class ScannerDemo1 {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("Please enter your name");
        String name=input.nextLine(); // nextLine is used when we have to type sentences in console
        System.out.println("My name is "+name);
    }
}
