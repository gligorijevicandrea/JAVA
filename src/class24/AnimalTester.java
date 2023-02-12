package class24;

public class AnimalTester {
    public static void main(String[] args) {
        // when we add abstract , we can't create an object ,but we can do Array
        // Animal animal=new Animal();
      //  animal.speak();

        Animal[]arr={new Cat(),new Dog()};

        for(Animal animal:arr){
            animal.speak();
            animal.eat();
        }


    }
}
