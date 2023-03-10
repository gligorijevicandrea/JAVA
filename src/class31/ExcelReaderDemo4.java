package class31;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ExcelReaderDemo4 {
    public static void main(String[] args) throws IOException {


        String path = "Files/Book1.xlsx";
        FileInputStream fileInputStream = new FileInputStream(path);
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
        XSSFSheet sheet1 = xssfWorkbook.getSheet("Sheet1");  // or only Sheet

        // if we want to print all rows one by one from Excel file

        int numberOfRows = sheet1.getPhysicalNumberOfRows();  // number of Rows

        var excelData=new ArrayList<>();   // var is same as List<Map<String,String>>

        // first loop to go through all the rows one by one
        for (int i = 1; i < numberOfRows; i++) {
            Row row = sheet1.getRow(i);
            LinkedHashMap  rowMap=new LinkedHashMap();
            rowMap.put("Name",row.getCell(0));
            rowMap.put("age",row.getCell(1));
            rowMap.put("City",row.getCell(2));
            rowMap.put("salary",row.getCell(3));

            excelData.add(rowMap);


        }
    }
}
