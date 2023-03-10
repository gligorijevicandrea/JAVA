package Homeworks.homework_7;

public class Task11 {
    public static void main(String[] args) {

        //  Write a program to print out duplicate elements from an Array of Strings?


        String[]arr1={"Sam","John","Sam","Philip","Tom","John"};

        for (int i = 0; i < arr1.length-1; i++) {

            for (int j = i+1; j < arr1.length; j++) {
                if(arr1[i].equalsIgnoreCase(arr1[j]) && i!=j){

                    System.out.println("Duplicate is "+arr1[j]);
                }
            }



        }

        System.out.println("**********************************");

        // Print duplicate elements in Array of Integers

        int [] arr = new int [] {1, 2, 3, 4, 2, 7, 8, 8, 3};


        //Searches for duplicate element
        for(int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    System.out.println(arr[j]);
            }

        }








        }
}
