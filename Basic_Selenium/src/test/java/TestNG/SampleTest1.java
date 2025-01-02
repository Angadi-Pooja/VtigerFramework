package TestNG;
import org.testng.annotations.Test;
public class SampleTest1 {
	
	@Test(priority = -1)
	public void CreateContact()
	{
		System.out.println("contact is created");
	}
	@Test(priority = 0)
	public void ModifyContact()
	{
		System.out.println("contact is modified");
	}
	@Test(priority = 1)
	public void DeleteContact()
	{
		System.out.println("Contact is deleted");
	}
}
