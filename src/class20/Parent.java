package class20;

public class Parent {

    String name;
    static String lastName;

   // mising something for private parent

    public static void main(String[] args) {

        Parent p=new Parent();
    }
    public void hello(){
        System.out.println("Hello from parent class");
    }

    protected static void bye(){ // accessible by class name
        System.out.println("protected method bye from parent class");
    }

    private void money(){
        System.out.println("private method bye from parent class");
    }
}
