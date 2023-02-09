package homework_10;

public class Task4 {
    public static void main(String[] args) {

        // How would you reverse a String word by word? for example
        //        input=>This is sentence i want to reverse
        //        output=>sihT si ecnetnes i tnaw ot esrever

        /*
        StringBuilder st=new StringBuilder("This is sentence i want to reverse");

        System.out.println(st.reverse());

        String str=st.toString();  // converting StringBuilser to String so we can call methods from String */

       String str="This is sentence i want to reverse";
        String[] arr=str.split(" ");

        for (String word:arr) {   // gives us all words from sentence
            for (int i = word.length()-1; i >=0 ; i--) {  // it will reverse all words but in same order of sentence
                System.out.print(word.charAt(i));
            }
            System.out.print(" ");
        }

        System.out.println("********************");

        for(String word3:arr){
            StringBuilder st=new StringBuilder(word3);
            st.reverse();
            System.out.print(st);
            System.out.print(" ");
        }


        System.out.println("*****************");

        for(String word1:arr){
            System.out.print(new StringBuilder(word1).reverse()+" ");
        }

        System.out.println("*****************");

        // how to reverse one word
        String word="This";
        for (int i = word.length()-1; i >=0 ; i--) {
            System.out.print(word.charAt(i));
        }









    }
}
