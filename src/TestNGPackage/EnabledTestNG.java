package TestNGPackage;

import org.testng.annotations.Test;

public class EnabledTestNG 
{
	  @Test(priority = 1, enabled=true)
	  public void loginTest() 
	  {
		  System.out.println("Login Successful");
	  }

	  @Test
	  public void launchBrowser() 
	  {
		  System.out.println("Launch the Browser");
	  }
	  
	  @Test(priority = 2, enabled = true)
	  public void sendMail() 
	  {
		  System.out.println("Sending Mail");
	  }
	  
	 @Test(priority = 5, dependsOnMethods = {"logoutTest"})			//	By default this TC is enabled = true
	  public void closeApplication() 
	  {
		  System.out.println("Close Application and Browser");
	  }
	  
	  @Test(priority = 3, dependsOnMethods = {"sendMail"})
	  public void receiveMail() 
	  {
		  System.out.println("Received Mail");
	  }
	  
	  @Test(priority = 4, enabled=false)
	  public void logoutTest() 
	  {
		  System.out.println("Logout Successful");
	  }

}

/**

Launch the Browser
Login Successful
Received Mail
Sending Mail
Logout Successful
Close Application and Browser

*/