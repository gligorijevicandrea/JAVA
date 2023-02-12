package class24;

public class ComputerTester {
    public static void main(String[] args) {

      //  int a=(int)12.5;

        Computer[]computers={new Apple(),new HP()};

        for(Computer c:computers){
            c.playVideo();
            c.browseInternet();

            if(c instanceof Apple) { // we are checking if variable c contains the object of an Apple class
                Apple apple = (Apple) c; // converting the variable c back to an apple object



            }

        }







    }
}
