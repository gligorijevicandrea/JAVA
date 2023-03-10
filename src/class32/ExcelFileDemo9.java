package class32;

import Utils.ExcelReader;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class ExcelFileDemo9 {
    public static void main(String[] args) throws IOException {

        List<Map<String,String>> excelData= ExcelReader.read(); // or this
        // or this we can use VAR --> var.excelData=ExcelReader.read();

       // Map<String,String> firstRow=excelData.get(1);
       // System.out.println(firstRow); // .get("salary");

        for (Map<String,String>row:excelData) {
            for(var entry:row.entrySet()){
                System.out.println(entry.getKey()+" "+entry.getValue());
            }
            System.out.println("*********");
        }
    }
}
