package class15;

public class MethodPracticeTester2 {
    public static void main(String[] args) {

        MethodPractice2 method = new MethodPractice2();

        String str=method.revStr("Hello World");
        System.out.println(str);

        System.out.println(method.revStr("Ryan"));

        System.out.println(method.revStr("ariK"));

        String str1=method.revStr("Hello World");
        System.out.println(str);
    }
}
