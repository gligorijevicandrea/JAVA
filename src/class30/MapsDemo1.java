package class30;

import java.util.HashMap;
import java.util.Map;

public class MapsDemo1 {
    public static void main(String[] args) {

        Map<Integer,String> studentsMap=new HashMap<>();

        studentsMap.put(1,"Nezir");
        studentsMap.put(2,"Anush");
        studentsMap.put(3,"Tami");
        studentsMap.put(4,"Aisha");

        System.out.println(studentsMap);
        System.out.println(studentsMap.get(3));  // it works with keys , not index , so prints only Tami
        System.out.println(studentsMap.size()); // 4
        System.out.println(studentsMap.containsKey(5));  // false
        System.out.println(studentsMap.containsValue("Aisha")); // true
        System.out.println(studentsMap.remove(1)); // after remove , sout
        System.out.println(studentsMap);
        studentsMap.replace(2,"Asli");
        System.out.println(studentsMap);






    }
}
