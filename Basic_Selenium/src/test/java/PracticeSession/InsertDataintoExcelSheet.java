package PracticeSession;

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
		         FileInputStream fis = new FileInputStream("C:\\Users\\sneha\\Desktop\\excel.xlsx.xlsx");
		         
		        Workbook book = WorkbookFactory.create(fis);
		        
		       Sheet sheet = book.getSheet("Sheet1");
		       
		       Row row = sheet.createRow(3);
		       
		      Cell cell = row.createCell(2);
		      
		     cell.setCellValue("Krish");
		     
		     FileOutputStream fis1 = new FileOutputStream("C:\\Users\\sneha\\Desktop\\excel.xlsx.xlsx");
		     book.write(fis1);
	}

}
