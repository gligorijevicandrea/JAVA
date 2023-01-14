package class8;

public class BreakKeywordDemo1 {
    public static void main(String[] args) {

        boolean summer = true;
        int temp = 75;

        while (summer) {

            if (temp <= 100) {
                System.out.println("I love summer because temperature is " + temp);
            } else {
                System.out.println("It's very hot " + temp);
                break;
            }

            temp += 5;

        }

        System.out.println("******************************");


        boolean summer1 = true;
        int temp2 = 75;


        while (temp2 <= 105) {
            if(temp<=100){
                System.out.println("I love summer because temperature is " + temp2);

            }else{
            System.out.println("It's very hot " + temp2);
            }
        temp2 += 5;
        }



        }

    }

