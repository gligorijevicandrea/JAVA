package class30;

import java.util.Map;
import java.util.TreeMap;

public class MapsDemo9 {
    public static void main(String[] args) {

           /*
        Create a map of countries with its capital that will store countries in alphabetical order.
        Print all keys and values from a country map using for each loop and iterator.
        Print all values from a country map using for each loop and iterator.
         */

        // Using it in Java 10

        Map<String, String> counties = new TreeMap<>();

        counties.put("China", "Beijing");
        counties.put("India", "New Deli");
        counties.put("Russia", "Moscow");
        counties.put("USA ", "Washington DC");

        var values=counties.values();
        for(var value:values){
            System.out.println(value);
        }


        var iterator=counties.values().iterator();
        while (iterator.hasNext()){

            var value=iterator.next();
            System.out.println(value);
        }
    }
}
