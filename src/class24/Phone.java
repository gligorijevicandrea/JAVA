package class24;

public abstract class Phone {
    /*
    create a phone class , lets create abstract methods like displayPictures ,  unlockPhone , sendText
    create 2 child classes Iphone Samsung Google  and provide specific implementation
    let's write code to achieve runtime polymorphism
     */

   abstract void displayPictures();

   abstract void unlockPhone();

   abstract void sendText();

}

class Iphone extends Phone{


    @Override
    void displayPictures() {
        System.out.println("high resolution pictures");
    }

    @Override
    void unlockPhone() {
        System.out.println("unlocking with face ID");
    }

    @Override
    void sendText() {
        System.out.println("i messages");
    }
}

class Samsung extends Phone{
    @Override
    void displayPictures() {
        System.out.println("low resolution");
    }

    @Override
    void unlockPhone() {
        System.out.println("unlock with password");
    }

    @Override
    void sendText() {
        System.out.println("send text thru t-mobile");
    }
}

class Google extends Phone{
    @Override
    void displayPictures() {
        System.out.println("google models are bad");
    }

    @Override
    void unlockPhone() {
        System.out.println("unlock with google voice");
    }

    @Override
    void sendText() {
        System.out.println("sending text thru verizon");
    }
}