package class21;

public class Animal {


    String name;
    String color="Black";

}
class Cat extends Animal{
    String color="white";  // instance variable
    int age=10;
    double weight;

    void printColor(){
        String color="Blue"; // local variable
        System.out.println(color); // prints local variable
        System.out.println(this.color); // prints instance variable
        System.out.println(super.color); // prints parent variable
    }
}

