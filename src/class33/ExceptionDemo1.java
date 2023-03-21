package class33;

public class ExceptionDemo1 {
    public static void main(String[] args) {

        String str="Java";
        str.charAt(10);

        System.out.println("Line 1");
        System.out.println("Line 2");
        System.out.println("Line 3");
        System.out.println("Line 4");
        System.out.println("Line 5");
        System.out.println("Line 6");

        try {
            // here we put the code which might throw an error
//            System.out.println(10/0);
//            int []arr=new int[-5];
//            String name=null;
//            System.out.println(name.length());
        }catch (NullPointerException npe){
            System.out.println("We are trying to access a method on a null object");
        }catch (ArithmeticException e){
            System.out.println("Someone is trying to divide by 0");
        }catch (Exception e){
            System.out.println("Something went wrong"); // if it doesn't find the best match , the last catch executes
        }

        System.out.println("Line 7");
        System.out.println("Line 8");
        System.out.println("Line 9");










    }
}
