package class20;

public class UserClass {
    /*
    Write program: userClass  that has a constructor that initializes instance variable name and mobile number.
     Create a subclass  userInfo that will have user address variable
     and it also being initialized through constructor call.
    Print users name, mobile number and address in userDetails method. Test your code.
     */
    // grand parent - object class , user class - parent , child UserClassTester

    String name;
    String phoneNumber;

    UserClass(String name,String phoneNumber){
        this.name=name;
        this.phoneNumber=phoneNumber;
    }

}
class userInfo extends UserClass{
    String address;

    userInfo(String name,String phoneNumber,String address){ // we enter this info userInfo in next class when we want to test
        super(name,phoneNumber);
        this.address=address;
    }
    void userDetails(){ // method
        System.out.println(name+" "+phoneNumber+" "+address);
    }


}