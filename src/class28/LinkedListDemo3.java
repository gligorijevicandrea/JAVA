package class28;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListDemo3 {
    public static void main(String[] args) {

        long starTime=System.currentTimeMillis();

        ArrayList<String> numbers=new ArrayList<>();

        for (int i = 0; i < 1000000; i++) {
            numbers.add(0,"Test data");
        }

        long endTime=System.currentTimeMillis();
        System.out.println(endTime-starTime);




    }
}
