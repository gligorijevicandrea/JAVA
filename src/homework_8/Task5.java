package homework_8;

public class Task5 {
    public static void main(String[] args) {

        // Using 2D array create a grocery list.
        //Inside you should have an array of veggies, fruits, dairy and sweets.
        // Retrieve all values from that array using 2 different loops

       String[][]groceries={ {"cucumber","tomato","pepper"},{"banana","kiwi","cherry"},
               {"milk","cheese","yogurt"},{"chocolate","candy","donuts"}

       };

        for (int i = 0; i < groceries.length; i++) {

            for (int j = 0; j < groceries[i].length; j++) {

                System.out.println(groceries[i][j]);
            }

        }

        System.out.println("*************************");


       for(String[]grocery:groceries){

           for(String food:grocery){
               System.out.println(food);
           }

       }





    }
}
