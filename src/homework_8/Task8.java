package homework_8;

import vazno.vaznoArrays.Arrays;

public class Task8 {
    public static void main(String[] args) {

        // Create 2D array of countries: north america countries, south america countries,
        // europe countries, asian countries, african countries.
        // Then print all values from that array using 2 different loops
        // and calculate how many total countries been stored

         String[][]country={ {"USA","Canada"},
                             {"Brasil","Columbia","Peru","Bolivia"},
                             {"Spain","France","Germany"},
                             {"Turkey","China","Japan"},
                             {"Tunis","Egypt"}
         };

        int total=0;

        for (int i = 0; i < country.length; i++) {
            for (int j = 0; j < country[i].length; j++) {
                System.out.println(country[i][j]);
             total=total+j;
            }

        }
        System.out.println(total);   // number of total elements in array


        System.out.println("*************************");

        for(String[]arr:country){

            for(String number:arr){
                System.out.println(number);
            }


        }






    }
}
