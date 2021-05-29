// Alphabetically execute the test cases

package TestNGPackage;

import org.testng.annotations.Test;

public class DemoTestNG 
{
	@Test
	void launchApp()
	{
		System.out.println("Application Launching");
	}
	
	@Test
	void loginApp()
	{
		System.out.println("Application Login");
	}

	@Test
	void regApp()
	{
		System.out.println("Application Registration");
	}
	
	@Test
	void closeApp()
	{
		System.out.println("Application Close");
	}
}
