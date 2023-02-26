package class29;

import java.util.*;

public class Task6 {
    public static void main(String[] args) {

        // How can you remove all duplicates from ArrayList?

        ArrayList<String> aList=new ArrayList<>();
        aList.add("John");
        aList.add("Jane");
        aList.add("James");
        aList.add("Jasmine");
        aList.add("Jane");
        aList.add("James");

        HashSet<String>set=new HashSet<>(aList);

        aList.clear();   // one way
        aList.addAll(set);
        System.out.println(aList);



        LinkedHashSet<String> uniqueList = new LinkedHashSet<>(aList);  // another way
        System.out.println(uniqueList);


    }
}
