package class12;

public class StringDemo9 {
    public static void main(String[] args) {

        // Check how many letters (alphabets) are in String str

        String str="jdnfkfd 3498234 ^*%*   fjljlgnvnsldnskgg";

        int counter=0;
        for (int i = 0; i < str.length(); i++) {

            if(Character.isAlphabetic(str.charAt(i))){
                counter++;
            }

        }
        System.out.println("Total isAlphabetic in Str is "+counter);

        // Check how many numbers are in String str

        for (int i = 0; i < str.length(); i++) {

            if(Character.isDigit(str.charAt(i))){
                counter++;
            }

        }
        System.out.println("Total isDigit in Str is "+counter);





    }
}
