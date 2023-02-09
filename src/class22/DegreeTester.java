package class22;

public class DegreeTester {

    public static void main(String[] args) {

        Degree degree = new Degree();
        degree.getPrerequisite(); // we get this To get a degree you need high school diploma

        Bachelors bachelors = new Bachelors();
        bachelors.getPrerequisite();

        Masters masters=new Masters();
        masters.getPrerequisite();


    }
}
