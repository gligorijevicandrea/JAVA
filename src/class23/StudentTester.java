package class23;

public class StudentTester {
    public static void main(String[] args) {

        // name of parent class - Student
       Student[]school={new SyntaxStudent(),new CollegeStudent(),new SchoolStudent()};

        for(Student schoolRules:school){
            schoolRules.reading();
            schoolRules.learning();
            schoolRules.practice();
        }








    }
}
