package class13;

public class SplitMethodDemo {
    public static void main(String[] args) {

        String str="I like java. I write a lot of code daily. I am from batch 15";

        String[]strArr=str.split("[.?]");

        System.out.println(strArr.length);  // prints out number of sentences

        System.out.println(strArr[1]); // prints out second sentence

        System.out.println(strArr[2].trim()); // removes space before third sentence



        // .length when we work with arrays []  , .length() with Strings










    }
}
