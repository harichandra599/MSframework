package TestCases;

import java.lang.reflect.Method;
import org.apache.log4j.Logger;
import org.testng.annotations.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
import BusinessFunctions.TestBase;
import UiActions.CreateCampaign_Elements;
import UiActions.Dashboard_Elements;

public class Create_Campaign extends TestBase 
{

	 CreateCampaign_Elements createcamp;
	 public static final Logger log=Logger.getLogger(Create_Campaign.class.getName());
	  
	/* @BeforeMethod
	 public void openbrowser(Method result) throws Exception
	  {
		  test = extent.startTest(result.getName());
		  test.log(LogStatus.INFO, result.getName() + " test Started");
		  init();
		  wait_for_page_load(5000);
	  }*/
	  @Test
	  public void cretecampaign() throws Exception 
	  { 
		  createcamp=new CreateCampaign_Elements(driver);
		  Thread.sleep(15000);
		  log.info("<===========create campaign  operations===========> ");
		  createcamp.createcampaign();
		  log.info("<===========Ended create campaign operations===========> ");
		 
		  
	  }
	/*  @AfterClass
	  public void close()
	  {
		  driver.close();
	  }*/

}
