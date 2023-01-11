package homework_2;

import java.util.Scanner;

public class DmvRepresentative {
    public static void main(String[] args) {

        Scanner dmv = new Scanner(System.in);

        System.out.println("How old are you?");

        int age = dmv.nextInt();

        if (age >= 18) {
            System.out.println("We will issue driver's licence for you");

        } else {
            System.out.println("get a learners permit");

        }
    }
}
