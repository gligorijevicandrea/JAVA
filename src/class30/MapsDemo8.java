package class30;

import java.util.TreeMap;

public class MapsDemo8 {
    public static void main(String[] args) {

        /*
        Create a map of countries with its capital that will store countries in alphabetical order.
        Print all keys and values from a country map using for each loop and iterator.
        Print all values from a country map using for each loop and iterator.
         */

        TreeMap<String, String> countries = new TreeMap<>();
        countries.put("Spain", "Madrid");
        countries.put("USA", " Washington, D.C");
        countries.put("India", "New Delhi");
        countries.put("France", "Paris");

        // ONE WAY
        var entrySet=countries.entrySet(); // or this Set<Map.Entry<String,String>> entrySet=countries.entrySet();
        for(var entry:entrySet){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

        // ANOTHER WAY
        var iterator=countries.entrySet().iterator();

        while (iterator.hasNext()){
            var entry=iterator.next();
            System.out.println(entry.getKey()+" "+entry.getValue());
        }







    }
}
