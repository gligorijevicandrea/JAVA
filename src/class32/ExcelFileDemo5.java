package class32;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelFileDemo5 {
    public static void main(String[] args) throws IOException {

        String path="Files/Book1.xlsx";
        FileInputStream fileInputStream=new FileInputStream(path);

        // class that we can use to read and write data easily from Excel files
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);  // var also
        Sheet sheet2=xssfWorkbook.getSheet("Sheet2");
        int noOfRows=sheet2.getPhysicalNumberOfRows();
        System.out.println(noOfRows);

        for (int i = 0; i < noOfRows; i++) {
            Row row=sheet2.getRow(i);  // instead of Row we can use var , if company is using Java 10
            System.out.println(row.getCell(0)+" "+row.getCell(1));
        }







    }
}
