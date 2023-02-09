package class20_1;

import class20.JavaTeacher;

public class University {

    // we want to test the code in different package
    public static void main(String[] args) {


       JavaTeacher jt= new JavaTeacher();

       jt.homework(); // public
      // jt.grade(); // protected , not available in different package
      // jt.scholarship();  // default, not available in different package
      // jt.extraPoint();  // private not visible in different package





    }
}
