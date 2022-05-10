package Test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POM.ABC;
import POM.HomePageZerodha;
import POM.ZerodhaLogin;
import Pojo.Browser;
import Utility.Excel;

public class HomePageZerodhaTest {
WebDriver driver;
	@BeforeMethod
	public void OpenBrowser() {
		Browser.Chrome("https://kite.zerodha.com/");
	}
	@Test
	public void Login() throws IOException {
		ZerodhaLogin zerodhalogin = new ZerodhaLogin(driver); 
		String uid=Excel.getData(0, 1, "ABC");
		zerodhalogin.userID(uid);
		String pass=Excel.getData(1, 1, "ABC");
		zerodhalogin.password(pass);
		zerodhalogin.loginButton();
		String pin=Excel.getData(2, 1, "ABC");
		zerodhalogin.pin(pin);
		zerodhalogin.loginButton();
		}
	@Test(dependsOnMethods = {"Login"} )
	public void butStock() {
		ABC a = new ABC();
		a.StockName("acc");
		
	}
}
