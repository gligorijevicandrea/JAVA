package class26;

public class Account {
    private double balance;
    private String accountNumber;
    private String type;
    private String accountTitle;


    // creating SET rn method for accountNumber
    public void setAccountNumber(String accountNumber){
        if(accountNumber.length()!=16){
            System.out.println("wrong account number");
        }else{
            this.accountNumber=accountNumber;
        }
    }

    // creating GET rn method for accountNumber

    public String getAccountNumber(){
        return accountNumber;
    }


    public void setBalance(double balance){
        // initializing the input meaning checking the values before we can assign them.
        if(balance<0){
            System.out.println("Negative balance is not allowed it's a current account");
        }else{
            this.balance=this.balance+balance;
        }
    }

    public double getBalance(){
       return balance;
    }

    // if we want to access PRIVATE data type as PUBLIC we add GET before variable name
    // to allow someone else to access those fields

    public String getAccountTitle(){
        return accountTitle;
    }

    public Account(double balance,String accountNumber,String type,String accountTitle){
        this.balance=balance;
        this.accountNumber=accountNumber;
        this.type=type;
        this.accountTitle=accountTitle;
    }
}



class AccountTester{
    public static void main(String[] args) {

        Account account=new Account(-1000,"djshfsf","Fsgsgs","gsgsgs");

        System.out.println(account.getAccountTitle()); // we can see the value because we are returning but we can't modify it

        account.setBalance(-45646);

    }
}