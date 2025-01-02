package TestNG;

import org.testng.annotations.Test;

public class DataProvider {
	
	@Test(dataProvider = "getData")
	public void bookTickets(String src, String dest)
	{
		System.out.println("book tickets from "+src+"to"+dest);
	}
	@org.testng.annotations.DataProvider
	public Object[][] getData()
	{
		Object[][] objArr = new Object[2][2];
		
		objArr[0][0]="Bangalore";
		objArr[0][1]="Goa";
		
		objArr[1][0]="Bangalore";
		objArr[1][1]="Pune";
		
		return objArr;
	}
}
