package class13;

public class ReplaceAllMethodDemo {
    public static void main(String[] args) {

        String str=" hfjfFHSJKSK4673437A%^&$()(075";

        System.out.println(str.replaceAll("[A-Z]","#"));  // replaces all capitals
        System.out.println(str.replaceAll("[a-z]","#"));  // replaces all small letters
        System.out.println(str.replaceAll("[0-9]","#"));  // replaces all numbers 0-9
        System.out.println(str.replaceAll("[A-Za-z]","#")); // replaces all letters,capitals and smalls
        System.out.println(str.replaceAll("[A-Za-z0-9]","#")); // replaces all letters,capitals and smalls and all numbers
        System.out.println(str.replaceAll("[^A-Za-z0-9]","#")); // DON"T replace all letters,capitals and smalls and all numbers
        System.out.println(str.replaceAll("[^A-Za-z0-9]","")); // empty will just delete the rest except for ^ not to










    }
}
