package Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POM.NewAccZerodha;
import Pojo.Browser;

public class NewAccZerodhaTest {

	WebDriver driver;
	@BeforeMethod
	public void OpenBrowser() {
		driver=Browser.Chrome("https://kite.zerodha.com/");
	}
	@Test
	public void NewAccZerodhaTest() throws InterruptedException {
		NewAccZerodha newacczZerodha=new NewAccZerodha(driver);
		newacczZerodha.NewAccount();
		
		//String a = driver.getWindowHandle();
		Set<String> b = driver.getWindowHandles();
		Iterator<String> z = b.iterator();
		while (z.hasNext()) 
		{ 
			driver=driver.switchTo().window(z.next());
		}
		
		
		Thread.sleep(1000);
		newacczZerodha.EnterMobNumber("9860287999");
		newacczZerodha.cntinue();
		Set<String> c = driver.getWindowHandles();
		Iterator<String> x = c.iterator();
		while (x.hasNext()) 
		{ 
			driver=driver.switchTo().window(x.next());
		}
		newacczZerodha.enterOTP("12345");
		newacczZerodha.cntinue();
	}
}