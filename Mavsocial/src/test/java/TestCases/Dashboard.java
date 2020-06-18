package TestCases;

import java.lang.reflect.Method;
import java.time.Duration;
import java.time.Instant;

import org.apache.log4j.Logger;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
import BusinessFunctions.TestBase;
import UiActions.Dashboard_Elements;


public class Dashboard extends TestBase 
{

	 Dashboard_Elements dashboard;
	 public static final Logger log=Logger.getLogger(Dashboard.class.getName());
	  
	/*@BeforeMethod
	 public void openbrowser(Method result) throws Exception
	  {
		  test = extent.startTest(result.getName());
		  test.log(LogStatus.INFO, result.getName() + " test Started");
		  init();
		  wait_for_page_load(5000);
	  }*/
	 
	  @Test
	  public void dashboardoperations() throws Exception 
	  { 
		  Instant start = Instant.now();
		  dashboard=new Dashboard_Elements(driver);
		  Thread.sleep(3000);
		  log.info("<===========Starting Dashboard operations===========> ");
		  dashboard.dashboardoperations();
		  log.info("<===========Ended Dashboard operations===========> ");
		  Instant end = Instant.now();
		  Duration timeElapsed = Duration.between(start, end); 
		  log.info("<===========Time taken for Dashboard operations is===========>" +timeElapsed.getSeconds());
		 
		  
	  }

	
}
