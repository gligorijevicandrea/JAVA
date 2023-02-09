package class19;

public class BankAccTest {
    public static void main(String[] args) {

        BankAccount ba=new BankAccount();
        ba.accNum=398731368446948439l;
        ba.money=1000;
        ba.deposit();

        System.out.println(ba.accNum);
        System.out.println(ba.money);

        System.out.println("-----------creating an obj from checking---------------");


        Checking check=new Checking();

        check.accNum=384364;  // super
        check.money=500;        // super
        check.interest=0;       // sub

        check.deposit();  // super
        check.transfer();  // sub

        System.out.println("-----------creating an obj from saving---------------");

        Savings save=new Savings();
        save.accNum=7935278373l;  // super
        save.money=8558;        // super
        save.profit=100;
        //save.interest=0;  //  siblings features are not available

        save.deposit();
        save.takeProfit();
        //save.transfer();    //  siblings features are not available
    }
}
