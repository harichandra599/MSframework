package UiActions;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;
import BusinessFunctions.TestBase;


public class Logout_Elements extends TestBase
{
	WebDriver driver;
	public Properties OR=new Properties();
	
	
	SoftAssert softassert=new SoftAssert();
    public static final Logger log=Logger.getLogger(Logout_Elements.class.getName());
    
    public  Logout_Elements(WebDriver driver)
    {
    	 this.driver=driver;
    	 PageFactory.initElements(driver, this);
    }
    
    @FindBy(how = How.XPATH, using = "//img[@class='profilepic']")
    WebElement profilepic; //Web Element and id For user name 
    
    @FindBy(how = How.LINK_TEXT, using = "Log Out")
    WebElement logoutbutton; //Web Element  For login button click 
    
    public void logoutoperations() throws Exception
    {
  	  
     
      //Click on profile icon 
      Thread.sleep(5000);
      Move_to_element(profilepic);
      log.info("<=========== profile name clicked successfully!===========> ");
  	  Thread.sleep(5000);
  	  Move_to_element(logoutbutton);
      log.info("<===========Logout button clicked successfully!===========> ");
      log.info("<===========User logged out successfully!===========> ");
}
}
