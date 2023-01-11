package class6;

public class ExampleOfWhileLoop {
    public static void main(String[] args) {


        // Write a loop to print numbers from 1 to 100
        // Write a loop to print odd numbers from 1 to 15
        // Write a loop to print these numbers 5,10,15,20,25,30.....50


        int number=1;
        while(number<=100){
            System.out.println(number);
            number++;
        }

        System.out.println("*****************");

        int number2=1;
        while(number<=15){
            System.out.println(number2);
            number+=2;
        }

        System.out.println("***************");


        int number3=5;
        while(number3<=50){
            System.out.println(number3);
            number3+=5;
        }



    }
}
