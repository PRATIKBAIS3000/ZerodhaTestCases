package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaLogin {

	@FindBy(xpath="//img[@alt='Kite']")private WebElement logo;
	@FindBy(xpath="//h2[text()='Login to Kite']")private WebElement text;
	@FindBy(xpath="//input[@id='userid']")private WebElement uid;
	@FindBy(xpath="//input[@id='password']")private WebElement pass;
	@FindBy(xpath="//input[@id='pin']")private WebElement pin;
	@FindBy(xpath="//a[text()='Forgot 2FA?']")private WebElement fpin;
	@FindBy(xpath="//button[@type='submit']")private WebElement login;
	@FindBy(xpath="//a[text()='Forgot user ID or password?']")private WebElement fpass;
	@FindBy(xpath="//a[text()='Don't have an account? Signup now!']")private WebElement New;
	@FindBy (xpath="//span[text()='TATACOFFEE']")private WebElement tatacoffee;
	@FindBy (xpath="//button[@class='button-blue buy']")private WebElement BuyButton;
		

	public ZerodhaLogin(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	public void BuyStok(WebDriver driver) {
		Actions a = new Actions(driver);
		a.moveToElement(tatacoffee).perform();
		BuyButton.click();
	}
	

		public void logo() {
			boolean b=logo.isDisplayed();
			System.out.println(b);
		}
		public void text() {
			boolean t=text.isDisplayed();
			System.out.println(t);
		}
		public void userID(String s) {
			uid.sendKeys(s);
		}
		public void password(String d) {
			pass.sendKeys(d);
		}
		
		public void pin(String p) {
			pin.sendKeys(p);
		}

		public void loginButton() {
			login.click();
		}
		
		public void forgotPassword() {
			fpass.click();
		}
		
		public void forgotPin() {
			fpin.click();
		}
		
		public void creatAccount() {
			New.click();
		}
		
		
}
