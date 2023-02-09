package class20;

import java.util.concurrent.Callable;

public class Child1 extends Parent{
    public static void main(String[] args) {


        Child1 c1=new Child1();
        c1.hello();
        Parent.bye(); // accessing static method in a static way by using class name
        Child1.bye(); // accessing static method instead of c1.bye(); , from parent class using child class name

       // c1.money(); money (); has private access in 'class20.Parent'

        c1.name="Andrea"; // access instants members
        Child1.lastName="Black";





    }
}
