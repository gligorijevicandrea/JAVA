package Homeworks.homework_13;



public class EmployeeTester {
    public static void main(String[] args) {

        FullTime emp=new FullTime("Andrea",25,"yes","morning");

        emp.partTimeInfo();
        emp.fullTimeInfo();
        emp.printInfo();

        FullTime full=new FullTime("Candy",38,"yes","any");

        full.printInfo();
        full.partTimeInfo();
        full.fullTimeInfo();



    }
}
