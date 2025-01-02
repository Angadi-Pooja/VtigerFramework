package Generic_Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class EXcel_Utility {
	public String getValuefromExcel(String sheetName, int rowNum, int cellNum) throws Throwable
	{
		FileInputStream fis1=new FileInputStream(IPathConstant.EXCELPATH);
		Workbook book1 = WorkbookFactory.create(fis1);
		Sheet sheet = book1.getSheet(sheetName);
		Row row = sheet.getRow(rowNum);
		Cell cell = row.getCell(cellNum);
		String data = cell.getStringCellValue();
		return data;
	}
	public String getValuefromExcelDta(String sheetName, int rowNum, int cellNum) throws Throwable
	{
		FileInputStream fis1=new FileInputStream(IPathConstant.EXCELPATH);
		Workbook book1 = WorkbookFactory.create(fis1);
		Sheet sheet = book1.getSheet(sheetName);
		Row row1 = sheet.getRow(rowNum);
		Cell cell1 = row1.getCell(cellNum);
		DataFormatter format = new DataFormatter();
		String data = format.formatCellValue(cell1);
		return data;
	}
	public String getValuefromExcelData(String sheetName, int rowNum, int cellNum) throws Throwable
	{
		FileInputStream fis1 = new FileInputStream("./src/test/resources/Book1.xlsx.xlsx");
		Workbook book = WorkbookFactory.create(fis1);
		Sheet sheet = book.getSheet(sheetName);
		Row row = sheet.getRow(rowNum);
		Cell cell = row.getCell(cellNum);
		String data = cell.getStringCellValue();
		return data;	
	}
	public String getValuefromExcelData1(String sheetName, int rowNum, int cellNum) throws Throwable
	{
		FileInputStream fis1 = new FileInputStream("./src/test/resources/Book1.xlsx.xlsx");
		Workbook book = WorkbookFactory.create(fis1);
		Sheet sheet = book.getSheet(sheetName);
		Row row = sheet.getRow(rowNum);
		Cell cell = row.getCell(cellNum);
		String data = cell.getStringCellValue();
		return data;
	}
	public Object[][] readDataForDataProvider(String sheetName) throws Throwable
	{
		FileInputStream fis1 = new FileInputStream(IPathConstant.EXCELPATH2);
		Workbook book = WorkbookFactory.create(fis1);
		Sheet sheet = book.getSheet(sheetName);
		int lastRow = sheet.getLastRowNum() + 1;
		int lastCell = sheet.getRow(0).getLastCellNum();
		Object[][] objArr = new Object[lastRow][lastCell];
		for(int i =0; i<lastRow; i++)
		{
			for(int j=0; j<lastCell; j++)
			{
				objArr[i][j]=sheet.getRow(i).getCell(j).toString();
			}
		}
		return objArr;
	}
}
