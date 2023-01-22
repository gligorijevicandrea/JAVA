package class12;

public class StringDemo8 {
    public static void main(String[] args) {

        String str="Java is love";

        char c=str.charAt(0); // on 0 is J
        System.out.println(c); // so we print out J

        char character=str.charAt(2);
        System.out.println(character);

        System.out.println();

        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));  // prints out all letters from loop
        }

        System.out.println("***************");

        // check how many times there is letter 'a' in String str

        int counter=0;

        for (int i = 0; i < str.length(); i++) {

            if(str.charAt(i)=='a'){
                    System.out.println(str.charAt(i));
                    counter++;
                }
            }

        System.out.println(counter);




    }
}
