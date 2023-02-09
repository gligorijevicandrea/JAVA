package class20;

public class BaseClass {

    String name="John";

    void hello(){
        System.out.println("Hello methods from BaseClass");
    }

}

class Child extends BaseClass{  // create relationship with extends

    String name="Jane";

    // using SUPER with INSTANTS VARIABLES
    void callMe(){
        System.out.println(name); // refer to current Jane
        System.out.println(super.name); // refer to immediate parent name John
    }

    void hello(){
        System.out.println("Hello methods from child class");
    }

    //  using SUPER with INSTANTS METHODS
    void callingParentMethod(){
        hello(); // referring to hello from this Child class
        super.hello();  // referring to Parents instants methods void hello() from Parent-Base class
    }


}