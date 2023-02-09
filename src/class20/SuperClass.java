package class20;

public class SuperClass {  // parent class

    SuperClass(){  // constructor
        System.out.println("I am a constructor from the parent class");
    }

}

   class SubClass extends SuperClass{ // child class


       SubClass() {  // if is constructor or method () the difference,this is constructor
           super(); // makes a call to the parent class constructor
           System.out.println("I am a child constructor");
       }
   }