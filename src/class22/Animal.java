package class22;

public class Animal {

    String name;
    String color;
    int age;
    double weight;

    void speak() {
        System.out.println("Animals can speak");
    }

    void eat() {
        System.out.println("All animals eat");
    }
}
class Cat extends Animal{
    // we are overriding speak method in Cat class
    void speak() {   // if we have speak here it will print this, not speak from parent class , unless we add super.speak();
        System.out.println("meow meow");
    }
    void printName(){
        System.out.println(name);
    }

}
class Dog extends Animal{

}

class Tester{

    public static void main(String[] args) {

        Cat cat=new Cat();

        cat.speak();

    }



}




