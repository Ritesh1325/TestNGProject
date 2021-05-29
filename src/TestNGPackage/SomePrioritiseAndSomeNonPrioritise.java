
/**   	Some Test Cases are executes Priorities and some Non-Priorities	 
 		Non-Priorities test cases executes alphabetically first
 		and then Priorities test cases will executes 						*/


package TestNGPackage;

import org.testng.annotations.Test;

public class SomePrioritiseAndSomeNonPrioritise 
{
	@Test(priority = 1)
	void launchApp()
	{
		System.out.println("Application Launching");
	}
	
	@Test
	void loginApp()
	{
		System.out.println("Application Login");
	}

	@Test(priority = 2)
	void regApp()
	{
		System.out.println("Application Registration");
	}

	@Test
	void updateApp()
	{
		System.out.println("Application Updation");
	}

	@Test(priority = 3)
	void closeApp()
	{
		System.out.println("Application Close");
	}
}

/** 	Output

Application Login
Application Updation
Application Launching
Application Registration
Application Close
*/