package class16;

public class SyntaxEmployee {

      /*
    Create class called SyntaxEmployee:
    create three variables empID , salary and set the CEO to "Sumair"
    set the value of eID , salary for each of the objects
    print out the eID , salary and CEO for each of the objects
     */

    String empID; // instant because it's different id for each employee
    double salary; // instant for same reason
    static String CEO="Sumair"; // static, because it stays the same

    public static void main(String[] args) {

        SyntaxEmployee emp1=new SyntaxEmployee();
        emp1.empID="Andrea";
        emp1.salary=100000;


       SyntaxEmployee emp2=new SyntaxEmployee();
       emp2.empID="S123";
       emp2.salary=120000;

        System.out.println(emp1.empID);
        System.out.println(emp1.salary);
        System.out.println(emp1.CEO);





    }









}
