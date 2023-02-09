package class15;

public class MethodPracticeTester3 {
    public static void main(String[] args) {
        MethodPractice3 method=new MethodPractice3();

        int[]array={10,20,30};

        System.out.println(method.arrSum(array));


        System.out.println(method.arrSum(new int[]{11,12,13}));
    }
}
