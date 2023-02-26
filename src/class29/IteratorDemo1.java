package class29;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo1 {
    public static void main(String[] args) {


        ArrayList<Double> numbers=new ArrayList<>();
        numbers.add(10.0);
        numbers.add(15.2);
        numbers.add(20.0);
        numbers.add(30.5);
        numbers.add(40.5);
        numbers.add(10.3);

        // print out all numbers from ArrayList
        for (Double number:numbers){
            System.out.println(number);
        }

        // remove numbers that are greater than 11
        // we can't change the size of elements in Enhanced Loop
        // we can remove numbers by index or their value
      /*  numbers.removeIf(number -> number > 11);   // THIS
        System.out.println(numbers); */


        // remove numbers that are greater than 11
        // getting the object of iterator
        Iterator<Double> iterator=numbers.iterator(); // OR THIS WAY

        /*System.out.println(iterator.hasNext()); //  returns true , it's safe to call next method because there are elements left

        System.out.println(iterator.next());
        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());
        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());

        System.out.println(numbers); */

        // hasNext keeps on returning true as long as there are elements left to be iterated
        while (iterator.hasNext()){
            double number=iterator.next();
            if(number>11){
                iterator.remove();
            }
        }

        System.out.println(numbers);



    }
}
