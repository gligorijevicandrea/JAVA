package class16;

public class Student {
    String name;
    String id;

    static String schoolName;  // if value is not going to change we should add static
    int age;
    double weight;

    void printName(){    //  it's called instant method because it's without static method
        System.out.println(name);
        System.out.println(schoolName);
    }

    static void printStudentInfo(){
     //   System.out.println(name); can't access here
        System.out.println(schoolName);
    }





}
