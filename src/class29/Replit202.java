package class29;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
public class Replit202 {


    public static void main(String[] args) {

        TreeMap<Integer, String> fruit = new TreeMap<>();
        fruit.put(1, "apple");
        fruit.put(2, "banana");
        fruit.put(3, "pear");
        fruit.put(4, "tomato");
        fruit.put(5, "mango");
        fruit.put(6, "kiwi");

        Set<Map.Entry<Integer,String>> entrySet=fruit.entrySet();
        for (Map.Entry<Integer, String> entry : entrySet) {
            System.out.println("Key is " + entry.getKey() + " item and values is " + entry.getValue());
        }


    }



}
