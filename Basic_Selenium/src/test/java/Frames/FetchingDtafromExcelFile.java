package Frames;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchingDtafromExcelFile {

	public static void main(String[] args) throws Throwable {
		//step 1: path connection
		FileInputStream fis = new FileInputStream("C:\\Users\\sneha\\Desktop\\Pooja Documents\\Testscript.xlsx.xlsx");
		
		//step 2:keep excel file in read mode
		Workbook book = WorkbookFactory.create(fis);
		
		//step 3: gets the control of the sheet
		Sheet sheet = book.getSheet("Sheet1");
		
		//step 4: get the control into row (row starts from 0)
		Row row = sheet.getRow(9);
		
		//step 5: get the control into column (column starts from 0)
		Cell cell = row.getCell(3);
		
		String excelValue = cell.getStringCellValue();
		System.out.println(excelValue);
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys(excelValue);
	}
}
