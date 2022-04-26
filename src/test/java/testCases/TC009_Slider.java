package testCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import base.DriverSetup;

public class TC009_Slider extends DriverSetup {
	public static String baseUrl = "https://jqueryui.com/slider/";
	
	@Test
	public static void sliderCheck() {
		driver.get(baseUrl);
		new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		//Horizontal Slider
		driver.switchTo().frame(0);
		WebElement element= driver.findElement(By.xpath("//div[@id='slider']/span"));
		Actions actions = new Actions(driver);
		actions.dragAndDropBy(element, 300, 0).build().perform();
		actions.dragAndDropBy(element, -200, 0).build().perform();
		
		//Vertical Slider
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Vertical slider")).click();
		driver.switchTo().frame(0);
		WebElement element2 = driver.findElement(By.xpath("//div[@id='slider-vertical']/descendant::span"));
		
		actions.dragAndDropBy(element2, 0, 100).build().perform();
		actions.dragAndDropBy(element2, 0, -200).build().perform();
		
		driver.switchTo().defaultContent();
	}

}
