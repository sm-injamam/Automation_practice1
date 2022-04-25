package testCases;


import java.time.Duration;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import base.DriverSetup;

public class TC006_RefreshAndNavigation extends DriverSetup{
	
	public static String baseUrl = "https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple";
	
	@Test
	public static void navigateAndRefreshPage() throws Exception {
		driver.get(baseUrl);
		new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.navigate().to("https://rahulshettyacademy.com/locatorspractice/");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		
		
		// navigate( ).to( )
		// navigate( ).back( )
		// navigate( ).forward( )
		// navigate( ).refresh( )
	}

}
