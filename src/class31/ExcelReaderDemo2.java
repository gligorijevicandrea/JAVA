package class31;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelReaderDemo2 {
    public static void main(String[] args) throws IOException {


        String path="Files/Book1.xlsx";
        FileInputStream fileInputStream=new FileInputStream(path);
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
        XSSFSheet sheet1=xssfWorkbook.getSheet("Sheet1");  // or only Sheet

        // if we want to print all rows one by one from Excel file

        int numberOfRows=sheet1.getPhysicalNumberOfRows();  // number of Rows

        // first loop to go through all tge rows one by one
        for (int i = 0; i < numberOfRows; i++) {
            Row row= sheet1.getRow(i);

            int numberOfCells=row.getPhysicalNumberOfCells();  // number of Cells
            // second loop to go through all the cells from each row
            for (int j = 0; j < numberOfCells; j++) {
                Cell cell= row.getCell(j);
                System.out.print(cell+" ");
            }
            System.out.println();
        }







    }
}
