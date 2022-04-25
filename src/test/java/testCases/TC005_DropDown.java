package testCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import base.DriverSetup;

public class TC005_DropDown extends DriverSetup{
	public static String baseUrl = "https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple";
	
	@Test(priority = 1)
	public static void selectingValueFromDown() throws Exception{
		driver.get(baseUrl);
		new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.switchTo().frame("iframeResult");
		WebElement webElement = driver.findElement(By.name("cars"));
		Select select = new  Select(webElement);
		Thread.sleep(3000);
		select.selectByIndex(3);
		//or
		// deselectAll( ):
		// deselectByValue( )
		// deselectByVisibleText( ):
		// getAllSelectedOptions( ):
		
		driver.switchTo().defaultContent();
		
	}
	
	@Test(priority = 2)
	public static void selectingMultipleValueFromDropDown() throws InterruptedException {
		driver.get(baseUrl);
		new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.switchTo().frame("iframeResult");
		WebElement webElement = driver.findElement(By.name("cars"));
		Select select = new Select(webElement);
		
		// for select more than one item
		
		Actions action = new Actions(driver);
		
		action.keyDown(Keys.CONTROL).click(select.getOptions().get(1))
		.click(select.getOptions().get(2))
		.click(select.getOptions().get(3))
		.keyUp(Keys.CONTROL).build().perform();
		
		Thread.sleep(3000);
		
		driver.switchTo().defaultContent();
		
	}

}
