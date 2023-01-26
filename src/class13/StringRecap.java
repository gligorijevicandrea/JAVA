package class13;

public class StringRecap {
    public static void main(String[] args) {

       // Print all letters from string one by one

        String str="Java is Great";

        for (int i = 0; i < str.length(); i++) {    // input of charAt() method is int
            System.out.println(str.charAt(i));
        }

        // how many times the letter a appeared in string

        int count=0;

        for (int i = 0; i < str.length(); i++) {

            if(str.charAt(i)=='a'){
                count++;
            }
        }
        System.out.println("Letter a has appeared "+count+" times");









        }
}
