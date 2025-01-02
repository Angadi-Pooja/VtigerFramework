package DDT;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InsertMultipleDataintoExcelSheet {
	public static void main(String[] args) throws Throwable {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.flipkart.com");
	
	FileInputStream fis = new FileInputStream("C:\\Users\\sneha\\Desktop\\Pooja Documents\\Testscript.xlsx.xlsx");
	
	//step 2:keep excel file in read mode
	Workbook book = WorkbookFactory.create(fis);
	
	//step 3: gets the control of the sheet
	Sheet sheet = book.getSheet("Sheet1");
	
	List<WebElement> alllinks = driver.findElements(By.xpath("//a"));
	
	for (int i=0; i<alllinks.size(); i++)
	{
		Row row = sheet.createRow(i);
		Cell cell = row.createCell(0);
		cell.setCellValue(alllinks.get(i).getAttribute("href"));
	}
	FileOutputStream fos = new FileOutputStream("C:\\Users\\sneha\\Desktop\\Pooja Documents\\Testscript.xlsx.xlsx");
	book.write(fos);
	book.close();	
}
}