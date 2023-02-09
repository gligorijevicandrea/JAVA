package class20;

public class TestingBaseClass {
    public static void main(String[] args) {

        Child child=new Child();
        child.callMe();   // accessing name Jane and John because we added sout name and sout super.name to void

        child.callingParentMethod();




    }
}
