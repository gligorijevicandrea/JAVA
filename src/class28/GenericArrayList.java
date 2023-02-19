package class28;

import class26.Dog;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class GenericArrayList {
    public static void main(String[] args) {

       ArrayList<String> names=new ArrayList<>();

       names.add("10");


        // OLD WAY OF DOING ARRAYS , TO KNOW IT ONLY FOR THE INTERVIEW

        Object a=new String("some value");
        Object b=new Integer(10);
        Object c=new Scanner(System.in);

        // No one now uses the Arrays like this
        ArrayList name=new ArrayList<>();
        name.add("Andy");
        name.add(10);
        name.add('a');
        name.add(new Dog("Jacky","Green","unknown"));

        for (Object j:name){
            ((String)j).trim();
        }






    }
}
