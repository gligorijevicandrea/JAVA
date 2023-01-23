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
            for (int j = 0; j < country[i].length; j++) {  // all countries in number of array of i
                System.out.print(country[i][j]+" "); // prints all elements from all arrays
             total=total+j;
            }
            System.out.println();

        }
        System.out.println(country[0].length);  // it will print how many elements are inside of 0 array
        System.out.println("Total number of countries in 2D Array is "+total);   // number of total elements in array


        System.out.println("*************************");

        for(String[]arr:country){    // number of countries inside 2D array
            for(String number:arr){   // elements from each array
                System.out.print(number+" ");
            }


        }






    }
}
