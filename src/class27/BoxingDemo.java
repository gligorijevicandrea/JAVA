package class27;

public class BoxingDemo {
    public static void main(String[] args) {


        int number=15;
        printData(number);

        Integer f=10; //  autoBoxing
        int number2=f;


    }

    // boxing - conversion from primitive data type to wrapping object

    public static void printData(Integer number){
        System.out.println(number);
    }


}
