package class12;

public class StringDemo {
    public static void main(String[] args) {

        // creating an object of String class
        String strObj=new String("Java");

        // another way of creating an object of String class-shorter way ,we will use this way
        String strObj2="Java";
        System.out.println(strObj2.length());  // prints out 4 , because of JAVA has 4 letters

        String str="Banana ";
        int len=str.length();
        System.out.println(len);  // prints 7 , Banana and space

        String name="Rafik poya ";
        if(name.length()>10){
            System.out.println("Name can't be more than 10 letters"); // this will print cause name has 11 letters and spaces
        }























    }
}
