package homework_4;

public class Task5 {
    public static void main(String[] args) {

        // Print odd numbers between 20 and 50 (2 ways)

        int number=20;

        while (number<=50) {
            if (number % 2 != 0) {
                System.out.println(number);
            }
            number++;
        }
        System.out.println("************************");

       int num=21;
       while (num<=50){
           System.out.println(num);
           num+=2;
       }

        System.out.println("***************");


        for (int i = 21; i <=50 ; i+=2) {
            System.out.println(i);
        }



    }
}
