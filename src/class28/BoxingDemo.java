package class28;

import java.util.ArrayList;

public class BoxingDemo {
    public static void main(String[] args) {


        Integer integer=new Integer(10);
        int number=integer; // autoBoxing
        int number2=integer.intValue(); // unboxing

        double d=12.3;
        Double wrapperD=new Double(d); //  boxing , manual part , the longer way
        Double wrapperP=12.5;  // or Double wrapperP=d;  //  autoBoxing

        Float f=12.4f;
        ArrayList<Double> arrayList=new ArrayList<>();
        arrayList.add(12.0);

        double fg=12;




    }
}
