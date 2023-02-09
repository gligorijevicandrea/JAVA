package class15;

public class MethodPractice {
    // create a method which returns true or false and takes the int number as parameter
    // if number is even it returns true otherwise it returns false

   boolean nameIsEven(int a){
       boolean flag;
       if(a%2==0){
           flag=true;
       }else{
           flag=false;
       }
       return flag;
   }

   boolean isEven(int num){
       return num%2==0;
   }

   boolean isEven2(int num2,int num3,int num4){
       if(num2%2==0&&num3%2==0&&num4%2==0){
           return true;
       }else{
           return false;
       }
   }
}
