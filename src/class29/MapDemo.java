package class29;

import class30.Entry;

import java.util.HashMap;
import java.util.TreeMap;

public class MapDemo {
    public static void main(String[] args) {

        // if there is Hash , there is no order
        // storing keys "strings" , values Integer
        TreeMap<String,Integer> groceries=new TreeMap<>();
        groceries.put("Eggs",10);
        groceries.put("Milk",5);
        groceries.put("Bread",5);
        groceries.put("Rice",6);
        groceries.put("Meat",7);
        groceries.put("Soap",5);

        System.out.println(groceries.get("Rice"));
        System.out.println(groceries);

        System.out.println(groceries.isEmpty());
        System.out.println(groceries.size());
        System.out.println(groceries.remove("Meat"));
        System.out.println(groceries);
        //groceries.clear();  // remove all










    }
}
