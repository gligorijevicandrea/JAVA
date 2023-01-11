package class5;

import java.util.Scanner;

public class SwitchCaseDemo5 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter your Gender  m f");
        char gender=scanner.next().charAt(0);



        switch (gender){

            case 'f': // if we don't add break after this , it will print out Female because it's next sout
            case 'F' :
                System.out.println("Female");
                break;
            case 'm':
            case 'M':
                System.out.println("Poor Males");
                break;
            default:
                System.out.println("not specified");


        }








    }
}
