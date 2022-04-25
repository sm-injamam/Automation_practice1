package pageObjModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PO_001_locatorsLearning {
	
	WebDriver driver=null;
	
	public PO_001_locatorsLearning(WebDriver driver) {
		this.driver = driver;
		
	}
	
	By userName = By.id("inputUsername");
	By passBy = By.name("inputPassword");
	By signInBtnBy = By.className("signInBtn");
	By errorMsgBy = By.cssSelector("p.error");
	By forgotPass = By.linkText("Forgot your password?");
	By name = By.xpath("//input[@type='text'][1]");
	
	public void sendKeysForUserName() {
		driver.findElement(userName).sendKeys("Batman");
	}
	
	public void sendKeysForPassWord() {
		driver.findElement(passBy).sendKeys("batman");
	}
	
	public void clickForSignInBtn() {
		driver.findElement(signInBtnBy).click();
	}
	
	public void getTextForErrorMsg() {
		String errorMsg = driver.findElement(errorMsgBy).getText();
		System.out.println(errorMsg);
	}
	
	public void clickForForgotPass() {
		driver.findElement(forgotPass).click();
	}
	
	public void sendKeysForName() {
		driver.findElement(name).sendKeys("Superman");
	}
	
	

}
