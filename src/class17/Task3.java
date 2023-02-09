package class17;

public class Task3 {





    /*
    create method to accept String as parameter
    and return new String that consist only of vowels.
    method should be available inside the class only  => private
    where it was declared and executed by calling it is name.

    return type => String
    name => getOnlyVowels
    parameters => String inputStr
    */



        private String getOnlyVowels (String inputStr){
            // AEIOUY aeiouy
            // Asghar => Aa
            return inputStr.replaceAll("[^AEIOUYaeiouy]", "");
        }



      // missing main method ?
       // System.out.println(getOnlyVowels); // how to print out this ?




}





