package class17;

public class StudentTester {
    public static void main(String[] args) {
       /*
        Student student1=new Student();
        student1.name="Zafar supari";
        student1.id="123";
        student1.age=26;
        student1.weight=50.5; */

        Student student1=new Student("Zafar","123",29,56);

        student1.printInfo();

        Student student2=new Student("Zam","345",45);

        student2.printInfo();

        // if student1 and student2 have same some of the values, we will get the error






    }
}
