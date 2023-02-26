package class30;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MapsDemo6 {
    public static void main(String[] args) {

        Map<Integer,String> studentsMap=new HashMap<>();

        studentsMap.put(1,"Nezir");
        studentsMap.put(2,"Anush");
        studentsMap.put(3,"Tami");
        studentsMap.put(4,"Aisha");
        studentsMap.put(5,"Gul");
        studentsMap.put(6,"Bahar");
        studentsMap.put(6,"Saba");

        // remove all the keys from above map if they are greater than 2

        Collection<String> values=studentsMap.values();
        System.out.println(values);

        // remove all the values which contain letter i
        values.removeIf(x->x.contains("i")); // using Lambda expression
        System.out.println(studentsMap);





    }
}
