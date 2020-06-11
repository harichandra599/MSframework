package TestCases;

import java.io.IOException;
import java.lang.reflect.Method;
import org.apache.log4j.Logger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
import BusinessFunctions.TestBase;
import UiActions.Enterpriseuserobj;
import jxl.read.biff.BiffException;

public class EnterpriseuserLogin extends TestBase
{
	 Enterpriseuserobj ent;
	 
	  public static final Logger log=Logger.getLogger(EnterpriseuserLogin.class.getName());
	  
	  @BeforeMethod
	  public void openbrowser(Method result) throws Exception
	  {
		  test = extent.startTest(result.getName());
		  test.log(LogStatus.INFO, result.getName() + " test Started");
		  init();
		  wait_for_page_load(5000);
	  }
	  @Test 
	  public void executionoder() 
	  { 
		  
	  }

	@AfterMethod
	public void browserclose() throws Exception
	{
		closeBrowser();
	}
}
