package class29;

import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) {

   /*
   2)Create an arraylist of cars and retrieve all the values using 3 different ways.
    */

        ArrayList<String> cars=new ArrayList<>();
        cars.add("bmw");
        cars.add("tesla");
        cars.add("fx");

        System.out.println(cars);  // 1.

        for(String car:cars){    // 2.
            System.out.println(car);
        }


        for (int i = 0; i < cars.size(); i++) {   // 3.
            String car= cars.get(i);
            System.out.println(car);
        }


    }
}
