package class28;

import java.util.LinkedList;

public class LinkedListsDemo2 {
    public static void main(String[] args) {

        LinkedList<String> subjects=new LinkedList<>();
        subjects.add("SDLC");
        subjects.add("manual testing");
        subjects.add("Jira");
        subjects.add("Git");
        subjects.add("Java");

        LinkedList<String> futureSubjects=new LinkedList<>();

        futureSubjects.add("Selenium");
        futureSubjects.add("Testng");
        futureSubjects.add("Cucumber");
        futureSubjects.add("SQL");
        futureSubjects.add("APIs");
        futureSubjects.add("Jenkins");

        // Get all the entries from subjects list and futureSubjects and put them in allSubjects lists

       LinkedList<String> allSubjects=new LinkedList<>();

       allSubjects.addAll(subjects);
       allSubjects.addAll(futureSubjects);
        System.out.println(allSubjects);

        LinkedList<String> subjectsILike=new LinkedList<>();
        subjectsILike.add("Java");
        subjectsILike.add("SDLC");
        subjectsILike.add("SQL");

        System.out.println(subjectsILike);
        allSubjects.removeAll(subjectsILike);
        System.out.println(allSubjects);








    }


}
