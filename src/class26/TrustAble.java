package class26;

public interface TrustAble {
    public static final int age=10; // Constants = public static final ,  all variables we create are
    String color="khdbfa";
    public abstract int trust(); // this is abstract class so we can't have a body of the method

    static void method1(){  // if we don't add static JAva will think it's abstract but there is bodu of the method
        System.out.println("Hello world");
    }

    default void method2(){

    }

    private void methods3(){

    }
}

class Bank implements TrustAble{

    @Override
    public int trust() {
        return 0;
    }

    public static void main(String[] args) {
        TrustAble.method1();  // class name.method  ( we can't create the object of interface)
        System.out.println(TrustAble.age);
    }
}