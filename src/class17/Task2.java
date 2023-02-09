package class17;

public class Task2 {
    /*
    take a method to take String as parameter
    and returns reversed String
    method should be available to all classes in project
    and accessible by class name
     */
    public static String reverseStr(String input){ // if we add static here
       return new StringBuilder(input).reverse().toString();

    }
        // static methods can be called just by name of the class.method name
    public static void main(String[] args) {

       // Task2 task2=new Task2(); // we don't need to write this
       // task2.reverseStr("Monday"); // without task2.
        reverseStr("Monday");



    }
}
