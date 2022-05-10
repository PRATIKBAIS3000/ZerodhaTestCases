package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GrowwLogin {
@FindBy(xpath="//span[text()='Login/Register']")private WebElement LoginKey;
@FindBy(xpath="//input[@id='login_email1']")private WebElement EmailID;
@FindBy(xpath="//span[text()='Continue']")private WebElement Cntinue;
@FindBy(xpath="//input[@id='login_password1")private WebElement Password;
@FindBy(xpath="//span[text()='Submit']")private WebElement Submit;
@FindBy(xpath="//input[@type=\"number\"])[1]")private WebElement pin;

	public GrowwLogin(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void ClickOnLogin() {
		LoginKey.click();
	}
	public void EnterEmailID(String s) {
		EmailID.sendKeys(s);
	}
	
	
	public void Cntinue() {
		Cntinue.click();
	}
	
	public void EnterPassword(String p) {
		Password.sendKeys(p);
	}
	
	public void Submit() {
		Submit.click();
	}
	
	public void EnterPIN(String pn) {
		pin.sendKeys(pn);
	}
}
