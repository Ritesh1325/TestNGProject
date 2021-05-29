
// Executes Test Cases accordingly Annotation sequence

package TestNGPackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsInTestNG 
{
	@AfterMethod
	void test5()
	{
		System.out.println("This is Test 5");
	}
	
	@BeforeTest
	void test2()
	{
		System.out.println("This is Test 2");
	}
	
	@AfterTest
	void test7()
	{
		System.out.println("This is Test 7");
	}
	
	@BeforeClass
	void test3()
	{
		System.out.println("This is Test 3");
	}
	
	@BeforeSuite
	void test1()
	{
		System.out.println("This is Test 1");
	}

	@BeforeMethod
	void test4()
	{
		System.out.println("This is Test 4");
	}
	
	@AfterClass
	void test6()
	{
		System.out.println("This is Test 6");
	}
	
	@AfterSuite
	void test8()
	{
		System.out.println("This is Test 8");
	}
	
	@Test
	void test()
	{
		System.out.println("Test Start");
	}
}
