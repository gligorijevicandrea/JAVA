package class7;

import java.util.Scanner;

public class DoWhileLoops {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        int number=0;   // if this number is 5
        do{             // we use do while because it will print at least one result if number is 5
            System.out.println("Please enter a number");
            number=scanner.nextInt();
        }while(number!=5);

        /*
       int number=5;

        while(number!=5){
            System.out.println("Please enter a number");
            int number2=scanner.nextInt();
        }  */



    }
}
