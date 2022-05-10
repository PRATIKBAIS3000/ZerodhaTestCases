package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPassZerodha {
	@FindBy(xpath="//img[@alt='Kite']")private WebElement logo;
	@FindBy(xpath="//h2[text()='Forgot user ID or password?']")private WebElement vtext;
	@FindBy(xpath="//label[@for='radio-31']")private WebElement radioRemembrID;
	@FindBy(xpath="//label[@for='radio-32']")private WebElement radioForgotID;
	@FindBy(xpath="(//input[@type='text'])[1]")private WebElement uid;
	@FindBy(xpath="(//input[@type='text'])[2]")private WebElement pan;
	@FindBy(xpath="//label[@for='radio-36']")private WebElement radioEmail;
	@FindBy(xpath="//label[@for='radio-37']")private WebElement radioSMS;
	@FindBy(xpath="(//input[@type='text'])[3]")private WebElement emailSMS;
	@FindBy(xpath="//input[@name='mobile']")private WebElement enterMobile;
	@FindBy(xpath="(//input[@type='text'])[4]")private WebElement Capcha;
	@FindBy(xpath="//button[@type='submit']")private WebElement reset;

	public ForgotPassZerodha(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public void logo() {
		boolean b=logo.isDisplayed();
		System.out.println(b);
	}
	
	public void vigibleText() {
		boolean v=vtext.isDisplayed();
		System.out.println(v);
	}
	
	public void enterUserID(String u) {
		uid.sendKeys(u);
	}
	
	public void enterUserPAN(String p) {
		pan.sendKeys(p);
	}
	
	public void OTPonEmail() {
		radioEmail.click();
	}
	public void OTPonSMS() {
		radioSMS.click();
	}
	
	public void EnterMobile(String m) {
		enterMobile.sendKeys(m);
	}
	
	
	public void EnterCapcha(String c) {
		Capcha.sendKeys(c);
	}
	
	public void ResetButton() {
		reset.click();
	}
}