package class32;

import Utils.ExcelReader;

import java.io.IOException;

public class ExceptionsDemo2 {
    public static void main(String[] args) {

        // System.out.println(10/0);
        //  int []arr={10,20,30};
        //  System.out.println(arr[5]);
        // ExcelReader.read();
        //int []arr=new int[-5];

//        try {
//            ExcelReader.read();
//        }catch (Exception e){
//            System.out.println(e);
//        }

    }



        static void test() throws IOException{
            try {
           ExcelReader.read();
       }catch (Exception e){
           System.out.println(e);
       }
        }




    }

