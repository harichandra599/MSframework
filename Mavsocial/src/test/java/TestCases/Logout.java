package TestCases;

import java.io.IOException;
import java.lang.reflect.Method;
import org.apache.log4j.Logger;
import org.testng.annotations.*;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
import BusinessFunctions.TestBase;
import UiActions.Login_Elements;
import UiActions.Logout_Elements;
import jxl.read.biff.BiffException;

public class Logout  extends TestBase
{
	 Logout_Elements logout;
	 public static final Logger log=Logger.getLogger(Logout.class.getName());
	  
	/* @BeforeMethod
	 public void openbrowser(Method result) throws Exception
	  {
		  test = extent.startTest(result.getName());
		  test.log(LogStatus.INFO, result.getName() + " test Started");
		  init();
		  wait_for_page_load(5000);
	  }*/
	  @Test 
	  public void logoutoperations() throws Exception 
	  { 
		  logout=new Logout_Elements(driver);
		  Thread.sleep(3000);
		  log.info("<===========Starting Logout operations===========> ");
		  logout.logoutoperations();
		  log.info("<===========Ended logout operations===========> ");
		 
		  
	  }
	  @AfterMethod
	  public void closebrowser()
	  {
		  driver.close();
		  log.info("<================Browser closed successfully========>");
	  }
}
