package class27;

public class Demo1 {
    public static void main(String[] args) {

        // Array is better  way of variables to store multiple names

        String[] names = {"Hiral", "Nima", "Laura", "Nat"};
        displayNames(names);
       // display2(names,name2,name3);  this is not a good way
    }

    // create parameters when we call the method to display all names from the Array
    public static void displayNames(String[]names) {

        // print out all names

        for (String name : names) { // this is a good way
            System.out.println(name);
        }

    }
    public static void display2(String name,String name2,String name3){  // this is not
        System.out.println(name);
        System.out.println(name2);
        System.out.println(name3);







    }
}
