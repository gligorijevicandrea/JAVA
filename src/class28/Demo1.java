package class28;

import java.util.ArrayList;

public class Demo1 {
    public static void main(String[] args) {

        // THIS IS NOT A GOOD WAY OF DOING IT

        // we can print the elements but we are not able to modify it from array list

        ArrayList<String> words=new ArrayList<>();
        words.add("cat");
        words.add("java");
        words.add("computer");
        words.add("lava");


        //remove all the elements from this list which ends with a
/*
        for(String s:words){

            if(s.endsWith("a")){
                words.remove(s);
            }

        }
*/
        for (int i = 0; i < words.size(); i++) {
            if(words.get(i).endsWith("a")){
                words.remove(i);
            }
        }

        System.out.println(words);


    }
}
