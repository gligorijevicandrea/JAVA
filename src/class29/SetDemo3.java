package class29;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo3 {
    public static void main(String[] args) {

        // no duplicates , sorts results in order (numeric or alphabetic)
        TreeSet<String> fruit=new TreeSet<>();
        fruit.add("kiwi");
        fruit.add("mango");
        fruit.add("banana");
        fruit.add("kiwi");
        fruit.add("apple");

        System.out.println(fruit);






    }
}
