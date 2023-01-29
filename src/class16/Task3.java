package class16;

public class Task3 {



        /*
        Create method that will print if string is palindrome or not
        return type - void
        name-isPalindrome
        paramete"rs= string inputStr
        example dad = dad true
        abc=cba = false
         */

        void isPalindrome(String str){
            StringBuilder st=new StringBuilder(str);
            st.reverse();
            String reversedStr=st.toString();
            if(str.equals(reversedStr)){
                System.out.println(str+" is palindrome");
            }else{
                System.out.println(str+" Not is palindrome");
            }
        }

    public static void main(String[] args) {

            Task3 task3=new Task3();
       // String resulrs=   task3.isPalindrome("Kaya"); can't assign void methods to variable
      //   System.out.println(task3.isPalindrome("Kaya");  can't use void methods in Println
        task3.isPalindrome("Kaya");













    }
}
