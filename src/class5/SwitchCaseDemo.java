package class5;

public class SwitchCaseDemo {
    public static void main(String[] args) {


        int day=1;

        switch (day){

            case 1:
                System.out.println("Monday");
            case 2:
                System.out.println("Tuesday");
            case 3:
                System.out.println("Wednesday");
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:   // same as else
                System.out.println("Wrong day");


        }







    }
}
