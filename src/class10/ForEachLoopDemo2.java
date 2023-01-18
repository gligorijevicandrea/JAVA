package class10;

public class ForEachLoopDemo2 {
    public static void main(String[] args) {

        int[]arr={10,13,20,25,45,50};

        for (int i = 0; i<arr.length; i++) {
            if(arr[i]%2!=0)
            System.out.println(arr[i]);
        }

        // Replace all odd numbers in this array with help of normal loop

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2!=0){
                arr[i]=0;  // replacing all odd numbers with zero
            }
        }

        System.out.println("After replacing all odd numbers with zero");

        for (int i = 0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }












    }
}
