package homework_7;

public class Task10 {
    public static void main(String[] args) {

        //  Write a java program to find the second largest number in the array?

        int []arr={2,4,6,8,10};

        int largest=arr[0];
        int secondLargest=arr[0];


        for (int i = 0; i < arr.length; i++) {

            if(arr[i]>largest){

                secondLargest=largest;
                largest=arr[i];

            }else if(arr[i]>secondLargest){

                secondLargest=arr[i];

            }
        }

        System.out.println("Second largest number is "+secondLargest);










    }
}
