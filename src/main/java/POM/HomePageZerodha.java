package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageZerodha {
	
@FindBy (xpath="//span[text()='TCS']")private WebElement TCSStok;
@FindBy (xpath="//button[@class='button-blue buy']")private WebElement BuyButton;
	


public HomePageZerodha(WebDriver driver)
	{
	PageFactory.initElements(driver, this);
	}
	
	public void BuyStok(WebDriver driver) {
		Actions a = new Actions(driver);
		a.moveToElement(TCSStok).perform();
		BuyButton.click();
	}


}