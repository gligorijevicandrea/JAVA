package class15;

import java.util.Scanner;

public class MethodsDemo1 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        int num =input.nextInt();
        System.out.println("number you entered is "+num);

        Methods method=new Methods();
        method.doSomeThing();

        int c=method.method2();
    }
}
