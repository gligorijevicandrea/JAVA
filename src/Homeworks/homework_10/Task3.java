package Homeworks.homework_10;

public class Task3 {
    public static void main(String[] args) {

        //  You have a String a=”Is it saturday? Is it raining?
        //  Do we have a Java Class today?”
        //  How would you find out how many sentences are in that String?


         String a="Is it saturday? Is it raining? Do we have a Java Class today?";

         /*
        String []arr=a.split("[?]");  // ending with ?
        System.out.println(arr.length);
        System.out.println(arr[1]);  // prints out sentence 1 Is it raining */

        // how to get second word ?


        System.out.println(a.split("[?]").length);





    }
}
