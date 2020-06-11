package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class Hi 
{

	WebDriver driver;
	
	 @BeforeMethod
	 public void start()
	{
		 System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/drivers/chromedriver.exe");
		 driver = new ChromeDriver();
		

	}

}
