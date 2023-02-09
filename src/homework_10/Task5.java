package homework_10;

public class Task5 {
    public static void main(String[] args) {


    // How would you check if String is palindrome or not?
        // aba=> true
        //  Abbc =>false

        StringBuilder word=new StringBuilder("aba");
        StringBuilder reverseWord=word.reverse();

        StringBuilder word2=new StringBuilder("Abbc");
        StringBuilder reverseWord2=word2.reverse();


        if(word.equals(reverseWord)){
            System.out.println("true");
        }

        if(word2.equals(reverseWord2)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }










    }
}
