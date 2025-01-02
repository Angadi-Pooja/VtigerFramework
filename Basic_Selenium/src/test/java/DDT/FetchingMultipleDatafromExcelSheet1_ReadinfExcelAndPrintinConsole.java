package DDT;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchingMultipleDatafromExcelSheet1_ReadinfExcelAndPrintinConsole {
		public static void main(String[] args) throws Throwable {
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.flipkart.com");
			
			FileInputStream fis = new FileInputStream("C:\\Users\\sneha\\Desktop\\Pooja Documents\\Testscript.xlsx.xlsx");
			
			//step 2:keep excel file in read mode
			Workbook book = WorkbookFactory.create(fis);
			
			//step 3: gets the control of the sheet
			Sheet sheet = book.getSheet("Sheet1");
			
			int rownum = sheet.getLastRowNum();
			System.out.println(rownum);
			
			for (int i=0; i<rownum; i++)
			{
				Row row = sheet.getRow(i);
				Cell cell = row.getCell(0);
				String value = cell.getStringCellValue();
				System.out.println(value);
			}
	}
}
