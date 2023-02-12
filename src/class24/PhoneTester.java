package class24;

public class PhoneTester {
    public static void main(String[] args) {

        // POLYMORPHISM

        Phone[]arr={new Iphone(),new Samsung(),new Google()};

        for (int i = 0; i < arr.length; i++) {
            Phone p=arr[i];
            p.displayPictures();
            p.unlockPhone();
            p.sendText();

        }

        /*
        for(Phone phone:arr){
        phone.displayPictures();
        phone.unlockPhone();
        phone.sendText();
         */


    }
}
