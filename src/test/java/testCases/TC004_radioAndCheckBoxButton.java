package testCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import base.DriverSetup;

public class TC004_radioAndCheckBoxButton extends DriverSetup{
	
	public static String baseUrlString = "https://jqueryui.com/checkboxradio";
	
	@Test
	public static void RadioAndCheckBoxButtonInFrame() throws Exception{
		
		driver.get(baseUrlString);
		new WebDriverWait(driver, Duration.ofSeconds(10));//if there any error don't close immediate, wait 10 sec.
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		//Switch to frame
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("/html/body/div/fieldset[1]/label[3]")).click();
		driver.findElement(By.xpath("//body[1]/div[1]/fieldset[2]/label[4]/span[1]")).click();
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		// Close site
		driver.close();
	}

}
