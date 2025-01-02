package TestNG;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertSame;

import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class HardAssert {
	
	@Test
	public void m1() {
		
		System.out.println("step1");
		System.out.println("step2");
		
		Assert.assertEquals(true, true);
		System.out.println("step3");
		System.out.println("step4");
	}
	@Test
	public void m2()
	{
	String expdata = "Qspiders ";
	String actdata = "Qspiders";
	Assert.assertEquals(actdata, expdata);
}
	@Test
	public void m3()
	{
		int a=1;
		int b=10;
		Assert.assertEquals(b, a, "Assert fail not equal");
		System.out.println("Assert pass equal");
		
	}
	@Test
	public void m4()
	{
		int a=10;
		int b=1;
		Assert.assertNotEquals(b, a, "it is equal");
		System.out.println("not equal");
	}
	@Test
	public void m5()
	{
		String s1="Pooj";
		String s2="Pooja";
		Assert.assertTrue(s1.equalsIgnoreCase(s2));
		System.out.println("Assert PASS");
	}
	@Test
	public void m6()
	{
		String s1="Shobh";
		String s2="Shobha";
		Assert.assertTrue(s1.equalsIgnoreCase(s2),"Assert FAIL");
		System.out.println("Assert PASS");
	}
//	@Test
//	public void m7()
//	{
//		String s1="Shobha";
//		String s2="Shobha";
//		
//	}
	@Test
	public void m10()
	{
		String s1="Shobha";
		String s2="Shobh";
		Assert.assertSame(s1, s2, " not same");
		System.out.println("same=");
	}
	@Test
	public void m11()
	{
		String s1="Shobha";
		String s2="Shobh";
		Assert.assertNotSame(s1, s2, " same");
		System.out.println("Not Same=");
	}
	@Test
	public void m12()
	{
		String s1="Shobha";
		String s2="Shobha";
		Assert.assertNotSame(s1, s2, " Same");
		System.out.println("Not Same=");
	}
	
}
