package homework_4;

public class Task4 {
    public static void main(String[] args) {

        // Print even numbers from 20 to 1 (2 ways)

       int number=20;

       while (number>=1){
          if (number%2==0){
              System.out.println(number);
          }
           number--;
       }

        System.out.println("*********************");

       int num=20;
       while (num>=1){
           System.out.println(num);
           num-=2;
       }

        System.out.println("*********************");

        for (int i = 20; i >1 ; i-=2) {
            System.out.println(i);
            }



    }
}
