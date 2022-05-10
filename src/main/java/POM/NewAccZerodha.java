package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewAccZerodha {

	@FindBy(xpath="(//a[@target='_blank'])[3]")private WebElement New;
	@FindBy(xpath="//input[@name='mobile']")private WebElement enterMobile;
	@FindBy(xpath="//button[@type='submit']")private WebElement cntinue;
	@FindBy(xpath="//input[@type='text']")private WebElement enterOTP;
	
	public NewAccZerodha(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

		public void NewAccount() {
			New.click();
		}
		public void EnterMobNumber(String m) {
			enterMobile.sendKeys(m);
		}
		public void cntinue() {
			cntinue.click();
		}
		public void enterOTP(String o) {
			enterOTP.sendKeys(o);
		}
		

	
	
}
