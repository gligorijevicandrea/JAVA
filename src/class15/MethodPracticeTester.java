package class15;

public class MethodPracticeTester {
    public static void main(String[] args) {

        MethodPractice method = new MethodPractice();

        boolean isEven = method.isEven(15);
        System.out.println(isEven);

        // call is even method for nums 100,12,20

        boolean isEven1 = method.nameIsEven(100);
        System.out.println(isEven1);

        boolean isEven2 = method.nameIsEven(12);
        System.out.println(isEven2);

        boolean isEven3 = method.nameIsEven(20);
        System.out.println(isEven3);

        boolean isEven4=method.isEven2(100,12,20);
        System.out.println(isEven4);

    }
}
