package class27;

import java.util.ArrayList;

public class Demo6 {
    public static void main(String[] args) {

        ArrayList<Boolean> booleans=new ArrayList<>();
        booleans.add(false);
        booleans.add(true);
        booleans.add(false);
        booleans.add(true);
        booleans.add(true);

        System.out.println(booleans.get(0));  // to print out first false
        System.out.println(booleans.size()); // prints size of booleans

        // create a normal for loop to print all the elements from this ArrayList

        for (int i = 0; i < booleans.size(); i++) {
            System.out.println(booleans.get(i));
        }

        // using while loop print all elements

        int i=0;
        while (i<booleans.size()){
            System.out.println(booleans.get(i));
            i++;
        }


    }
}
