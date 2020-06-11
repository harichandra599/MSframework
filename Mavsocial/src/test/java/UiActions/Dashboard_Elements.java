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

public class Dashboard_Elements extends TestBase 
{
	WebDriver driver;
	public Properties OR=new Properties();
	SoftAssert softassert=new SoftAssert();
    public static final Logger log=Logger.getLogger(Dashboard_Elements.class.getName());
    
    public  Dashboard_Elements(WebDriver driver)
    {
    	 this.driver=driver;
    	 PageFactory.initElements(driver, this);
    }
    @FindBy(how = How.NAME, using = "email")
    WebElement musername; //Web Element and id For user name 
    
    @FindBy(how = How.NAME, using = "password")
    WebElement mpassword; //Web Element and id For user name 
    
    @FindBy(how = How.XPATH, using = "//button[@type='button']")
    WebElement loginbutton; //Web Element  For login button click
    
    @FindBy(how = How.XPATH, using = "//*[@id='examplePassword']")
    WebElement selectpage; //Web Element  For select page click
    
    @FindBy(how = How.XPATH, using = "//h5[contains(text(),'Latest Comments')]")
    WebElement ltcomments; //Web Element  For Latest comments 
    
    @FindBy(how = How.XPATH, using = "//i[@class='fa fa-home']")
    WebElement dashboardclick; //Web Element  For Latest comments 
    
   public void dashboardoperations() throws Exception
    {
  	  
    /*  File config = new File(System.getProperty("user.dir") + "//src//test//java//Configurations//config.properties");
      FileInputStream f1 = new FileInputStream(config);
      OR.load(f1);
      //enter user name 
  	  Thread.sleep(5000);
  	  musername.sendKeys(OR.getProperty("username"));
  	  log.info("<=========== User name entered successfully!===========> ");
  	  mpassword.sendKeys(OR.getProperty("password"));
	  log.info("<===========password entered successfully!===========> ");
	  Thread.sleep(5000);
      loginbutton.click();
      log.info("<===========Login button clicked successfully!===========> ");
      log.info("<===========User logged in successfully!===========> ");*/
      
	  
	   //click on Dash board 
	   wait_in_seconds(6);
	   Move_to_element(dashboardclick);
	  //click on facebook pages drop down
      Move_to_element(selectpage);
      log.info("<===========FaceBook pages drop down clicked successfully!===========> ");
      String fbpageslist=selectpage.getText();
      //Print facebook pages 
      log.info("Page names are \t" + fbpageslist );
      //validate that latest comments heading was present or not in top right corner 
      Assertions(ltcomments, "Latest Comments");
      log.info("<===========Latest comment showing successfully!===========> ");
      
}
	
}
