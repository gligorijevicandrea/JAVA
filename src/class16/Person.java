package class16;

public class Person {

    private double bankBalance=125000;  // nobody can access private in any other class

    String address="Street 123";  // default access level is applied can't be access in another class,just in same package
   public String name="Jon Snow"; // everyone can access it even in other class

    private void printPhonePassword(){  // only for this class
        System.out.println("pass123");
    }

    void printSSN(){  // good for another class
        System.out.println("123456789");
    }

   public void printTikTokAccount(){  // good for another class
        System.out.println("user123");
    }
    public static void main(String[] args) {

        Person person=new Person();
        System.out.println(person.bankBalance);
        System.out.println(person.address);
        System.out.println(person.name);

        //it's all good within same class
        person.printPhonePassword();
        person.printSSN();
        person.printTikTokAccount();




    }


}
