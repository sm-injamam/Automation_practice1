package advancedTestCase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.DriverSetup;
import pageObjModel.PO_001_locatorsLearning;

public class Tc001_LocatorsLearning_adv extends DriverSetup {
	
	@Test
	public void locatorLearning() throws InterruptedException {
		String baseUrl= "https://rahulshettyacademy.com/locatorspractice/";
		driver.get(baseUrl);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		/*
		 * driver.findElement(By .xpath("//input[@id='inputUsername']"))
		 * .sendKeys("xman"); Thread.sleep(2000);
		 */
		
		// created on pageObjModel package.
		PO_001_locatorsLearning locatorsLearning = new PO_001_locatorsLearning(driver);
		
		//driver.findElement(By.id("inputUsername")).sendKeys("xman");
		locatorsLearning.sendKeysForUserName();
		Thread.sleep(2000);
		//driver.findElement(By.name("inputPassword")).sendKeys("xman");
		locatorsLearning.sendKeysForPassWord();
		Thread.sleep(2000);
		//driver.findElement(By.className("signInBtn")).click();//no space allowed
		locatorsLearning.clickForSignInBtn();
		Thread.sleep(3000);
		
		//For CssSelector
		//Formula:    tagname.value (if class is given)
		//			  tagname#value (if id is given)
		//String errorMsg=driver.findElement(By.cssSelector("p.error")).getText();
		locatorsLearning.getTextForErrorMsg();
		//System.out.println(errorMsg);
		
		//driver.findElement(By.linkText("Forgot your password?")).click();
		locatorsLearning.clickForForgotPass();
		Thread.sleep(2000);
		
		//for xpath formula: //tagname[@attribute='value']
//		driver.findElement(By.xpath("//input[@type='text'][1]"))
//		 .sendKeys("xman"); 
		locatorsLearning.sendKeysForName();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='text'][2]"))
		 .sendKeys("xman email"); 
		Thread.sleep(2000);
		driver.findElement(By .xpath("//input[@type='text'][3]"))
		 .sendKeys("xman number"); 
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
		Thread.sleep(2000);
		// example for move to parent to child. 
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
		Thread.sleep(2000);
		

		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("xman");
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
		
		driver.findElement(By.id("chkboxOne")).click();
		
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		
		Thread.sleep(2000);
		
//		driver.findElement(By.id("inputUsername")).sendKeys("xman");
//		Thread.sleep(2000);
//		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
//		Thread.sleep(2000);
//		driver.findElement(By.className("signInBtn")).click();//no space allowed
//		Thread.sleep(3000);
	}

}
