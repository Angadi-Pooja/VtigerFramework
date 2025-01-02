package TestNG;

import org.testng.annotations.Test;

public class SampleTest3 {
	
	@Test(priority = 1)
	public void CreateContact()
	{
		System.out.println("contact is created");
	}
	@Test(priority = 2, dependsOnMethods = "CreateContact")
	public void ModifyContact()
	{
		System.out.println("contact is modified");
	}
	@Test(priority = 0, dependsOnMethods = "CreateContact" )
	public void DeleteContact()
	{
		System.out.println("Contact is deleted");
	}
}
