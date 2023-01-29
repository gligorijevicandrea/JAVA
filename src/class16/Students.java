package class16;

public class Students {

    /*
    create class called students
    create 3 variables Name , ID and numberOfStudents
    create 3 objects of the Student class
    set the value for studentName, studentID and increment the numberofStudents for each object
    print out total number of students
     */

    String name; // instants, it changes the value for each object
    String ID; //  instants, it changes the value for each object
    static int numberOfStudents;

    public static void main(String[] args) {


        Students student1 = new Students();
        student1.name = "Andy";
        student1.ID = "S123";
        student1.numberOfStudents++;  // increment the number of students


        Students student2=new Students();
        student2.name="Candy";
        student2.ID="F123";
        student2.numberOfStudents++;

        Students student3=new Students();
        student3.name="Mish";
        student3.ID="R13";
        student3.numberOfStudents++;

        System.out.println(Students.numberOfStudents);  // we get 3 , because there are 3 students or objects


    }

}
