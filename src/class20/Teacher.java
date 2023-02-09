package class20;

public class Teacher {

     /*
    Write a Java program called Teacher.
    Identify features and 4 behaviour of that Class.
    Create 3 subclasses MathTeacher,
     ChemistryTeacher and PianoTeacher that would have it their own features and behaviour.
     Test all 4 classes
     */

    String teacherName;
    String teacherId;

    public void homework() {
        System.out.println("Homeworks make students perfect!!!!");
    }

    protected void grade() {
        System.out.println("Grade doesn't matter");
    }

     void scholarship() {  // default when there is nothing before void
        System.out.println("Good students from this class will get scholarship");
    }

    private void extraPoint() {  // only within the same class
        System.out.println("All students attend the class will get extra point");
    }
}

class MathTeacher extends Teacher{
    String subject;
    String grade;

    void excellent(){
        System.out.println("This class is excellent");
    }
}

class ChemistryTeacher extends Teacher{
    String homework;
    String test;

    void science(){
        System.out.println("Chemistry class is fun");
    }
}

class Pianoteacher extends Teacher{
    String classic;
    String schedule;

    void happy(){
        System.out.println("This class make students happy");
    }
}







