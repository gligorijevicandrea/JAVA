package class29;

import java.util.LinkedHashSet;

public class SetDemo2 {
    public static void main(String[] args) {

        // Does not allow duplicates and retains the insertion order
        LinkedHashSet<String> fruit=new LinkedHashSet<>();
        fruit.add("kiwi");
        fruit.add("mango");
        fruit.add("banana");
        fruit.add("kiwi");
        fruit.add("apple");

        System.out.println(fruit);




    }
}
