package Homeworks.homework_8;

public class Task4 {
    public static void main(String[] args) {


        // Create 2D array of cars : american, german, korean, italian.
        // Then retrieve all values from that array using 2 different loops


         String[][]cars={ {"Ford","Chevrolet","Lincoln"},{"Mercedes","Audi","Bmw"},{"Toyota","Mitshubishi","Nisan"},
                 {"Alfa","Ferarri","Fiat"}

         };


        for (int i = 0; i < cars.length; i++) {

            for (int j = 0; j < cars[i].length; j++) {
                System.out.println(cars[i][j]);  // to print all the values inside of the array
            }


        }

        System.out.println("***********************");

       for(String[] arr:cars) {          // regular name to start the enhanced for loop
           for (String brand : arr) {    // new name of what we are going to print brand
               System.out.println(brand);  //  // brand prints all values from array ,like j in another loop
           }
       }





    }
}
