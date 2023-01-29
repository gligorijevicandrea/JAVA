package class16;

public class Task7 {

    /*
    create method that will accept an array as parameters and will return a sum of all elements
    from that array. Method should be visibly only within same package
    and accessible by creating an instance of the class(object)

    return type= int
    name => sumArrayElements
    parameters => int [] arr
    access modifier = default
     */

        int sumArrayElements(int []array){ // if we don't add static int we need object of the class to create
        int sum=0;

        for(int num:array){
            sum+=num;
        }
        return sum;
    }

    public static void main(String[] args) {

        int[] arr={10,25,35,45};
        Task7 task7=new Task7();  // this if there is no static before int

        System.out.println(task7.sumArrayElements(arr)); // and we add here task7 because there is no static




    }

}
