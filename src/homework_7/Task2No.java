package homework_7;

import java.util.Scanner;

public class Task2No {
    public static void main(String[] args) {

        // Using Scanner create an array of countries.
        // When an array is created, retrieve all values from it and
        // while retrieving those values print capital for each country. (use 2 different loops).


        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter 6 countries");

        String[] country = new String[6];




        String[] capitals = {"Belgrade", "Paris", "Madrid", "Rome", "Tokyo", "Berlin"};
        for (int i = 0; i < country.length; i++) {
            country[i]=scan.nextLine();
            System.out.println(country[i] + "-" + capitals[i]);


        }
        }
}
