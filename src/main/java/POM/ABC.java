package POM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Pojo.Browser;

public class ABC {
	@FindBy (xpath="//span[text()='TATACOFFEE']")private WebElement tatacoffee;
	@FindBy (xpath="//button[@class='button-blue buy']")private WebElement buy;
	@FindBy (xpath="//span[@class='nice-name']")private List<WebElement> stock;
	
	
	public ABC() {
		PageFactory.initElements(driver, this);
	}
	WebDriver driver;
	
	public void StockName(String s) {
		tatacoffee.click();
		
		for(int a=0;a<stock.size();a++) {
		
			String w =stock.get(a).getText();
		
			if(w.equalsIgnoreCase(s)) {
				
				buy.click();
		}	
		}
	}
	
	
	
	
//	public void SelectStockList(WebDriver driver) {
//		//WebDriverWait wait = new WebDriverWait(driver,Duration.ofMillis(3000));
//		//wait.until(ExpectedConditions.visibilityOf(TATASTEEL));
//		Actions act = new Actions (driver);
//		act.moveToElement(Stock.get(1));
//		act.perform();
//	}
	
}