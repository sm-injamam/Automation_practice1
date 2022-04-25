// Assertion by softAssert.

package testCases;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import base.DriverSetup;

public class Tc003_verifyPageTitle extends DriverSetup{
public static String baseUrl="http://automationpractice.com/index.php";
	
	@Test(priority=1)
	public void verifyPageTitle_shoudPass() 
	{
		
		driver.get(baseUrl);
		new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		String titleFromWebsite = driver.getTitle();
		System.out.println("The Title of the site is: "+ titleFromWebsite);
		//assertEquals(titleFromWebsite, "my store"); //replacement by soft assert
		
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(titleFromWebsite, "My Store");
		
		softAssert.assertAll();
		
	}
	
	@Test(priority=2)
	public static void isWebsiteSecured() {
		String cUrl = driver.getCurrentUrl();
		if(cUrl.contains("https"))
		{
			System.out.println("Secured");
		}
		else System.out.println("NOT Secured");
			
		
	}

}
