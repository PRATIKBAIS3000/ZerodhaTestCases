package Test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import POM.ABC;
import POM.ZerodhaLogin;
import Pojo.Browser;
import Utility.Excel;
import Utility.ScreenShot;
@Listeners(ListenersClass.class)
public class LoginTest {
	
	WebDriver driver;
	@BeforeMethod
	public void launchBrowser() {
		driver =Browser.Chrome("https://kite.zerodha.com/");
	}
	@Test
	public void syso() {
		System.out.println("Run");
	}
	@Test
	public void LoginWithValidCredencials() throws IOException, InterruptedException {
		
		ZerodhaLogin zerodhalogin = new ZerodhaLogin(driver); 
		
		String uid=Excel.getData(0, 1, "ABC");
		zerodhalogin.userID(uid);
		String pass=Excel.getData(1, 1, "ABC");
		zerodhalogin.password(pass);
		zerodhalogin.loginButton();
		String pin=Excel.getData(2, 0, "ABC");
		zerodhalogin.pin(pin);
		zerodhalogin.loginButton();
		
		ABC a = new ABC();
		a.StockName("acc");
		//zerodhalogin.BuyStok(driver);
}
	@Test(dependsOnMethods = {"LoginWithValidCredencials"})
	public void BuyStocK() {
		ABC a = new ABC();
		a.StockName("acc");
	}
	
	@AfterMethod
	public void screenshot() throws IOException {
		driver= ScreenShot.SS(driver);
	}
}
