package Frames;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class InsertDataintoExcelSheet {

	public static void main(String[] args) throws Throwable {
		//step 1: path connection
				FileInputStream fis = new FileInputStream("C:\\Users\\sneha\\Desktop\\excel.xlsx.xlsx");
				
				//step 2:keep excel file in read mode
				Workbook book = WorkbookFactory.create(fis);
				
				//step 3: gets the control of the sheet
				Sheet sheet = book.getSheet("Sheet1");
				
				Row row = sheet.createRow(5);
				
				Cell cell = row.createCell(4);
				
				cell.setCellValue("Qspiders");
				
				FileOutputStream fos = new FileOutputStream("C:\\Users\\sneha\\Desktop\\excel.xlsx.xlsx");
				book.write(fos);
				book.close();
	}

}
