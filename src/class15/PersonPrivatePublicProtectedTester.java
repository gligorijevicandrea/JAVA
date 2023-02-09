package class15;

import class16.PersonPrivatePublicProtected;

public class PersonPrivatePublicProtectedTester {
    public static void main(String[] args) {

        PersonPrivatePublicProtected person= new PersonPrivatePublicProtected();

        // System.out.println(person.bankBallance); //private
        // System.out.println(person.adress); // default
        System.out.println(person.name);

        person.printTikTokAcc();
        // person.printSSN();
        // person.printPhonePassword();


    }

}
