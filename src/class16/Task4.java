package class16;

public class Task4 {


        /*
        Create a method that will say Hello in different languages based on the country
        that will pass when method is executed
        return type => String void
        name = sayHello
        parameter => String countryName
         */

        String sayHello(String countryName){

            switch (countryName) {
        // break is not needed when we use return keyword
                case "USA":
                    return "Hello";
                case "Kazakhstan":
                    return "Salem";
                case "Italy":
                    return "Ciao";
                case "China":
                    return "Ni hao";
                default:
                    return "Country not found";
            }
        }
     public static void main(String[] args) {

            Task4 task4=new Task4();
         System.out.println(task4.sayHello("Italy"));









    }
}
