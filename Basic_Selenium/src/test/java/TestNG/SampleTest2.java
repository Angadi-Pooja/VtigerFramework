package TestNG;

import org.testng.annotations.Test;

public class SampleTest2 {
	
	@Test(invocationCount =3)
	public void createContact()
	{
		System.out.println("contact created");
	}
	
	@Test(enabled = false)
	public void modifyContact()
	{
		System.out.println("contact modified");
	}

}
