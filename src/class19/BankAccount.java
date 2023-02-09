package class19;

public class BankAccount {   // parent class or super class or base class
    long accNum;
    double money;

    void deposit(){
        System.out.println("transfer method from BankAccount class");
    }

}

class Checking extends BankAccount{   //child class or subclass or derived class

    double interest;

    void transfer(){
        System.out.println("transfer method from checking class");
    }

}

class Savings extends BankAccount{

    double profit;

    void takeProfit(){
        System.out.println("Profit from savings");
    }
}

class SuperSavings extends Savings{

    void superSaving(){
        System.out.println("SuperSaving method from saving class");
    }
}
