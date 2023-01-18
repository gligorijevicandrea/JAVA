package class10;

public class ForEachLoopDemo3 {
    public static void main(String[] args) {

        // we can't update the elements in for each loop it because we don't have access to the index

        int[]arr={10,13,20,25,45,50};

        for(int x:arr){
            if(x%2!=0){       // replaces odd numbers with zero
                x=0;
            }
            System.out.println(x);
        }










    }
}
