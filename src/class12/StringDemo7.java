package class12;

public class StringDemo7 {
    public static void main(String[] args) {

        String str="I love java";

        boolean startsWith=str.startsWith("I");
        System.out.println(startsWith);
        System.out.println(str.endsWith("java"));

        // Method changing when multiple methods are called on the same line , only when we have 2 same data types
        System.out.println(str.toLowerCase().startsWith("i"));
        System.out.println(str.contains("java"));












    }
}
