package class9;

public class ArraysDemo6 {
    public static void main(String[] args) {


        // create an array and store 10,20,30,4,5,6,7,80
        // add all the elements which are multiple of 2

        int[] numbers2 = {10, 20, 30, 4, 5, 6, 7, 80};

        int sum1 = 0;

        for (int i = 0; i < numbers2.length; i++) {
            if (numbers2[i] % 2 == 0)     // adding all the numbers that are even
                sum1 = sum1 + numbers2[i];
        }
        System.out.println(sum1);





    }

}
