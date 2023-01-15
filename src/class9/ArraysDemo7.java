package class9;

public class ArraysDemo7 {
    public static void main(String[] args) {

        // write a program that can tell us how many times the number 10.5 is present in the array


        double[] arr={10.5,12.0,45,10.5,23,10.5};

        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==10.5){
                sum++;    // to add how many times we have 10.5 or sum=sum+1;
            }
        }
        System.out.println(sum);  // to get number 3














    }
}
