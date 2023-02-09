package class19;

import java.util.concurrent.Callable;

public class ConstructorChain {

    ConstructorChain(){
        System.out.println("I am none argument constructor");
    }

    ConstructorChain(String str){
        this();  // making a call to a none argument constructor
        System.out.println(str); // this()  -> must be always on first line
    }

    ConstructorChain(String str,int number){
        this("Hello");
        System.out.println("This constructor with int parameter");
    }

    public static void main(String[] args) {

        //ConstructorChain obj=new ConstructorChain(10);
       // System.out.println("---------END OF CODE---------------");

        ConstructorChain obj2=new ConstructorChain("Hello",10);
        System.out.println("---------END OF CODE---------------");

    }
}
