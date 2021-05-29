package TestNGPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependancyInTestNG
{
	@Test
	void launchApp()
	{
		System.out.println("Application Launching");
	}
	
	@Test(dependsOnMethods={"launchApp"})
	void loginApp()
	{
		System.out.println("Application Login");
		Assert.assertTrue(true);
	}

	@Test(dependsOnMethods={"launchApp", "loginApp"})
	void regApp()
	{
		System.out.println("Application Registration");
		Assert.assertTrue(true);
	}

	@Test(dependsOnMethods={"regApp"})
	void updateApp()
	{
		System.out.println("Application Updation");
		Assert.assertTrue(false);
	}

	@Test(dependsOnMethods={"regApp","updateApp"})	//	Skip this TC because updateApp() assert is false
	void closeApp()
	{
		System.out.println("Application Close");
	}
}
