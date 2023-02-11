package class23;

/*
Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent.
Define common behavior within parent class and override some of the methods in child classes
Define some methods specific to child classes
Write example of achieving run time polymorphism
 */
public class Student {

    public void reading(){
        System.out.println("Every student needs to read in english");
    }
    void learning(){
        System.out.println("You need to learn every day");
    }
    void practice(){
        System.out.println("practicing skills");
    }
}

class SyntaxStudent extends Student{
    @Override
    public void reading() {
        System.out.println("you need to read 3 hours");
    }

    @Override
    void learning() {
        System.out.println("you need to learn 3 hours");
    }

    @Override
    void practice() {
        System.out.println("you need to practice 3 hours");
    }
}

class CollegeStudent extends Student{
    @Override
    void practice() {
        System.out.println("College students need to learn more");
    }
}

class SchoolStudent extends Student{

}