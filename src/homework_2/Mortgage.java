package homework_2;

public class Mortgage {
    public static void main(String[] args) {

        double mortgageRate = 4.0;
        int mortgagePrice = 150000;

        if (mortgageRate > 4.5){
            System.out.println("User will not buy a house");
        }else{
            System.out.println("buying");
            if (mortgagePrice>=200000){
                    System.out.println("user will take a loan");
            }else{
                System.out.println("user will pay cash");
            }
        }
    }
}
