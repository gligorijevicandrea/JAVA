package homework_2;

import java.util.Scanner;

public class CityTemperature {
    public static void main(String[] args) {

        Scanner cityTemperature=new Scanner(System.in);

        System.out.println("What is your city?");

        String city=cityTemperature.nextLine();

        System.out.println("What's the temperature outside?");

        int temperature=cityTemperature.nextInt();

        System.out.println("The temperature in the city is "+(temperature-32)*0.5556+" celsius");




    }
}
