package class24;

public abstract class Animal {
    /*
    define the speak eat methods and create 3 subclasses and override the speak eat methods
     */

    // when we add abstract , we can't create an object but we can do Array


        abstract void speak () ;  // without body  , speak method won't have any implementation that's when we use abstract
// we are just defining that animals speak

        void eat () {
            System.out.println("Animal eats!");
        }
    }
class Cat extends Animal {
        @Override
        void speak() {
            System.out.println("Meow!");
        }
        @Override
        void eat() {
            System.out.println("Num num!");
        }
    }

class Dog extends Animal{

    @Override
    void speak() {
        System.out.println("wuff wuff");
    }

    @Override
    void eat() {
        System.out.println("hum hum");
    }
}

