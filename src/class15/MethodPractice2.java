package class15;

public class MethodPractice2 {

    String str(String str){
        String newStr="";

        for (int i = str.length()-1; i < 0; i--) {
            newStr+=str.charAt(i);
        }
        return newStr;
    }

    String revStr(String input){
        return new StringBuilder(input).reverse().toString();
    }

    String str1(String str1){
        String newStr1="";

        for (int i = str1.length()+1; i < 0; i--) {
            newStr1+=str1.charAt(i);
        }
        return newStr1;
    }
}
