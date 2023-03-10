package Homeworks.homework_7;

public class Task5 {
    public static void main(String[] args) {

        // Create a 2D array of integers.
        // Develop a program which will calculate the sum of  even and odd numbers for that array.

        int matrix [][]={ {10,25,30},
                          {45,50,66},
                          {70,85,90,105},

        };

        int sum=0;
        int sum1=0;

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {

                if (matrix[i][j] % 2 == 0) {
                    sum = sum + matrix[i][j];
                }
            }

            for (int j = 0; j < matrix[i].length; j++) {

                if (matrix[i][j] % 2 != 0) {
                    sum1 = sum1 + matrix[i][j];
                }

            }


        }

        System.out.println("The sum of all Even numbers from Array is "+sum);
        System.out.println("The sum of all Odd numbers from Array is "+sum1);




    }
}
