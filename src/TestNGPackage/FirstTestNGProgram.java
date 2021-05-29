package TestNGPackage;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstTestNGProgram 
{
  @Test (priority = 1)
  public void loginTest() 
  {
	  System.out.println("Login Successful");
  }
  
  @BeforeTest
  public void launchBrowser() 
  {
	  System.out.println("Launch the Browser");
  }
  
  @Test (priority = 3)
  public void sendMail() 
  {
	  System.out.println("Mail Sending");
  }
  
  @AfterTest 
  public void closeApplication() 
  {
	  System.out.println("Close Application and Browser");
  }
  
  @Test (priority = 2) 
  public void receiveMail() 
  {
	  System.out.println("Received Mail");
  }

}

/* Output
 * 
Launch the Browser
Login Successful
Received Mail
Mail Sending
Close Application and Browser

*/
