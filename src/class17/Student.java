package class17;

public class Student {

    String id;
    String name;
    int age;
    double weight;

    public Student(String sName,String sId,int sAge){
        id=sId;
        name=sName;
        age=sAge;
    }

    // private is within same class for void method
    // public can be used in another class
    // can't use static with constructors
    public Student(String sname,String sId,int sAge,double sWeight){ // in front of Student
        id=sId;
        name=sname;
        age=sAge;
        weight=sWeight;
    }

    void printInfo(){
        System.out.println(name+" "+id+" "+age+" "+weight);
    }







}
