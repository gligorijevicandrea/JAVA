package class16;

public class StudentTester {
    public static void main(String[] args) {


        Student student=new Student();
        student.name="Zafar";
        student.id="123";
        student.age=22;
        student.weight=70;
        student.schoolName="Syntax";


        Student student1=new Student();
        student.name="Hamid";
        student.id="456";
        student.age=5;
        student.weight=86;
       // student.schoolName="Syntax";

        Student student2=new Student();
       // student.name="Nelson";
        student.id="789";
        student.age=26;
        student.weight=90;
      //  student.schoolName="Syntax";

        System.out.println(student2.schoolName);  // it will print out Syntax , use this one or one down
        System.out.println(Student.schoolName); // access by class name,variable name .. just in statics
        System.out.println(student2.name); // null will print




    }
}
