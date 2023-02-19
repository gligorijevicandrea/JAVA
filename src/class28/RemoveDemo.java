package class28;

import java.util.ArrayList;
import java.util.Iterator;

public class RemoveDemo {
    public static void main(String[] args) {

        // THIS IS THE WAY OF REMOVING THE ELEMENTS FROM AN ARRAY LIST

        ArrayList<String> words=new ArrayList<>();
        words.add("cat");
        words.add("java");
        words.add("computer");
        words.add("lava");

        // it doesn't work with java 9 and below
        var name="fjskghskhgs";
        var c='s';
        var f=12.5;


        // works from java 6 to 19
      //   Iterator<String> iterator= words.iterator();

        /*
        while (iterator.hasNext()){
            String s=iterator.next();
            if(s.endsWith("a")){
                iterator.remove();
            }

        }
        */

        // doesn't work in java 7
        words.removeIf(x -> x.endsWith("a"));  // expression .. x or s , whatever

        System.out.println(words);


    }
}
