package class27;

import java.util.ArrayList;

public class Demo7 {
    public static void main(String[] args) {


        ArrayList<String> names=new ArrayList<>();
        names.add("Fizzy");
        names.add("Savo");
        names.add("Sam");
        names.add("Urwa");
        names.add("Tarik");
        names.add("Abeera");

        System.out.println(names.contains("Tarik"));  // prints true

        System.out.println(names); // prints all
        names.remove("Sam");  // remove Sam from array list
        System.out.println(names);
        names.set(3,"Sam");  // replace name on index 3 with Sam
        System.out.println(names);




    }
}
