package DDT;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchingDatafromExcelUsingDataFormatter {
		public static void main(String[] args) throws Throwable {
			FileInputStream fis = new FileInputStream("C:\\Users\\sneha\\Desktop\\Pooja Documents\\Testscript.xlsx.xlsx");
			
			//step 2:keep excel file in read mode
			Workbook book = WorkbookFactory.create(fis);
			
			//step 3: gets the control of the sheet
			Sheet sheet = book.getSheet("Sheet2");
			
			Row row = sheet.getRow(0);
			Cell cell = row.getCell(0);
			
			DataFormatter format = new DataFormatter();
			String exceldata = format.formatCellValue(cell);
			System.out.println(exceldata);
	}

}
