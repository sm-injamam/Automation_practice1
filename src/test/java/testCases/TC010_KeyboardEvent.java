package testCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import base.DriverSetup;

public class TC010_KeyboardEvent extends DriverSetup{
	public static String baseUrl = "http://automationpractice.com/index.php";
	
	@Test
	public static void keyboardEventCheck() {
		driver.get(baseUrl);
		new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		WebElement element = driver.findElement(By.xpath("//input[@id='search_query_top']"));
		element.sendKeys(Keys.chord(Keys.SHIFT,"tedtalk"));
		//driver.findElement(locator).sendKeys(Keys.chord(Keys.CONTROL,Keys.SHIFT,Keys.DELETE));
		element.sendKeys(Keys.chord(Keys.ENTER));
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		//WebElement element2 =
		 wait.until(ExpectedConditions.elementToBeClickable(By.id("someid")));
	}

}
