package TestCases;

import java.io.IOException;
import java.lang.reflect.Method;
import java.time.Duration;
import java.time.Instant;

import org.apache.log4j.Logger;
import org.testng.annotations.*;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
import BusinessFunctions.TestBase;
import UiActions.Login_Elements;
import jxl.read.biff.BiffException;

public class Login  extends TestBase
{
	 Login_Elements login;
	 public static final Logger log=Logger.getLogger(Login.class.getName());
	  
	 @BeforeMethod
	 public void openbrowser(Method result) throws Exception
	  {
		  test = extent.startTest(result.getName());
		  test.log(LogStatus.INFO, result.getName() + " test Started");
		  init();
		  wait_for_page_load(5000);
	  }
	 /* @DataProvider(name="loginData")
		public String[][] getTestData() throws IOException, BiffException
		{
			String[][] testRecords = getData("TestData.xls", "Sheet3");
			return testRecords;
		}*/
	  @Test /*(dataProvider="loginData")*/
	  public void loginoperations() throws Exception 
	  { 
		  //calculate time 
		  Instant start = Instant.now();
		  login=new Login_Elements(driver);
		  Thread.sleep(3000);
		  log.info("<===========Starting Login operations===========> ");
		  login.loginoperations();
		  log.info("<===========Ended login operations===========> ");
		  //calculate time 
		  Instant end = Instant.now();
		  Duration timeElapsed = Duration.between(start, end); 
		  log.info("<===========Time taken for Login operations is===========>" +timeElapsed.getSeconds());  
	  }
}
