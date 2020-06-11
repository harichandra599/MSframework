package UiActions;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import BusinessFunctions.TestBase;

public class CreateCampaign_Elements extends TestBase 
{
	WebDriver driver;
	public Properties OR=new Properties();
	SoftAssert softassert=new SoftAssert();
    public static final Logger log=Logger.getLogger(CreateCampaign_Elements.class.getName());
    
    public  CreateCampaign_Elements(WebDriver driver)
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
    
    @FindBy(how = How.XPATH, using  = "//i[@class='fa fa-bullseye']")
    WebElement campaign; //Web Element  For mouse hover on campaign  
    
    @FindBy(how = How.XPATH, using  = "//a[@class='Mav__menu__link'][contains(text(),'Create')]")
    WebElement create; //Web Element  For click on create  
    
    @FindBy(how = How.NAME, using  = "name")
    WebElement cname; //Web Element  For campaign name  
    
    @FindBy(how = How.XPATH, using  = "//input[@placeholder='Description']")
    WebElement cdescription; //Web Element  For campaign description  
    
  /*  @FindBy(how = How.XPATH, using  = "//select[@class='form-control']")         //div[@class='col-md-12 col-lg-12']//select[@class='form-control']
    WebElement seelctteam; //Web Element  For select team 
    
    @FindBy(how = How.CLASS_NAME, using  = "checkbox")
    WebElement tcheckbox; //Web Element  For team member selection 
*/    
    @FindBy(how = How.XPATH, using  = "//button[@class='btn btn-secondary ml-2 btn-sm']")
    WebElement ccreate2; //Web Element  For campaign create  
    

  
    
    
    public void createcampaign() throws Exception
    {
  	  
     /* File config = new File(System.getProperty("user.dir") + "//src//test//java//Configurations//config.properties");
      FileInputStream f1 = new FileInputStream(config);
      OR.load(f1);
      //enter user name 
  	  Thread.sleep(3000);
  	  musername.sendKeys(OR.getProperty("username"));
  	  log.info("<=========== User name entered successfully!===========> ");
  	  mpassword.sendKeys(OR.getProperty("password"));
	  log.info("<===========password entered successfully!===========> ");
	  Thread.sleep(3000);
      loginbutton.click();
      log.info("<===========Login button clicked successfully!===========> ");
      log.info("<===========User logged in successfully!===========> ");
      //hover mouse on campaign 
*/      Thread.sleep(5000);
      Move_to_element(campaign);
      //Click on create button
      Thread.sleep(5000);
      create.click();
      log.info("<===========Page navigated to create campaign successfully!===========> ");
      //Give campaign name
      Thread.sleep(5000);
      cname.sendKeys("campaign by automation");
      log.info("<===========Campaign name given successfully!===========> ");
      //give campaign description 
      cdescription.sendKeys("campaign description by automation");
      log.info("<===========campaign description given successfully!===========> ");
      /*select Team name 
      String teamname = "Hari Team";
      select_by_visibletext(seelctteam, teamname);
      log.info("<===========Team selected successfully!===========> ");
      //select team member 
      Thread.sleep(5000);
      tcheckbox.click();
      log.info("<===========Team member selected successfully!===========> ");
      //click on create button 
      ccreate2.click();
      log.info("<===========Team member selected successfully!===========> ");
      */
      //click on create campaign 
      Thread.sleep(3000);
      //scroll down the page 
      Move_to_element(ccreate2);
      log.info("<===========create button selected successfully!===========> ");
      //validate page navigated to campaign list and created campaign should selected or not 
      wait_in_seconds(10);
      
      
    
    }

}
