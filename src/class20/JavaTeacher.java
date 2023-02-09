package class20;

public class JavaTeacher extends Teacher{


    void code(){
        System.out.println("Java teacher how to code");
    }

    public static void main(String[] args) {

        JavaTeacher java=new JavaTeacher();

        java.teacherName="Asel";
        java.teacherId="A7575";

        java.homework(); // public available in same package
        java.grade(); // protected available in same package
        java.scholarship(); // default available in same package
        // java.extraPoint; // private members ( variables and methods) DO NOT participate in the Inheritance







    }
}
