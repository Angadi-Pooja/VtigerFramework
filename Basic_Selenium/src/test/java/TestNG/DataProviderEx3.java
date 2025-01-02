package TestNG;

import org.testng.annotations.Test;

public class DataProviderEx3 {
	
	@Test(dataProvider = "getData")
	public void bookTickets(String src, String dest, int numofppl)
	{
		System.out.println("book tickets from "+src+"to"+dest+","+numofppl);
	}
	@org.testng.annotations.DataProvider
	public Object[][] getData()
	{
		Object[][] objArr = new Object[3][3];
		
		objArr[0][0]="Bangalore";
		objArr[0][1]="Goa";
		objArr[0][2]=3;
		
		objArr[1][0]="Bangalore";
		objArr[1][1]="Pune";
		objArr[1][2]=4;
		
		objArr[2][0]="Bangalore";
		objArr[2][1]="Mumbai";
		objArr[2][2]=5;
		return objArr;
	}
}
