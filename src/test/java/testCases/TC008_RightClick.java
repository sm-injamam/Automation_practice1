package testCases;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import base.DriverSetup;

public class TC008_RightClick extends DriverSetup {
	public static String baseUrl = "https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple";
	
	@Test(enabled = false)
	public static void doubleclickRightClick () throws InterruptedException {
		driver.get(baseUrl);
		new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.switchTo().frame("iframeRsult");
		
		Actions actions = new Actions(driver);
		WebElement doubleClickElement = driver.findElement(By.xpath("//p[contains(text(),'The multiple attribute specifies that multiple opt')]"));
		actions.doubleClick(doubleClickElement).build().perform();
		
		Thread.sleep(3000);
		
		WebElement rightClick = driver.findElement(By.xpath("//body/form[1]/input[1]"));
		actions.contextClick(rightClick).build().perform();
		Thread.sleep(3000);
		
		driver.switchTo().defaultContent();
		

		//click()
		//dragAndDrop( )
		//clickAndHold( )
		//keyDown( )
		//keyUp( )
		//release( )
		
		//build( )
		//perform();
	}
	

}
