package class20_1;

import class20.Teacher;

public class SeleniumTeacher extends Teacher { // when we add this extends inheritance , protected is available
    public static void main(String[] args) {

        SeleniumTeacher selenium=new SeleniumTeacher();
        selenium.homework(); // public so it's available in different package
        selenium.grade(); // protected is available because there is inheritance(extends) in different package , otherwise it won't be

       //  selenium.scholarship(); // default not available , default visible only within same package







    }
}
