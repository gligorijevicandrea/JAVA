package class29;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {

        // Dog d1=new Dog("Jacky","Persian",25);

        ArrayList<Dog> dogs=new ArrayList<>();
        dogs.add(new Dog("Jacky","persian",15));
        dogs.add(new Dog("Mish","lab",12));
        dogs.add(new Dog("Rex","bulldog",3));
        dogs.add(new Dog("Samy","bishon",4));

        for(Dog d:dogs){
            d.printDogName();
        }





    }
}
