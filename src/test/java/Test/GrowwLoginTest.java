package Test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.Browser;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POM.GrowwLogin;
import Utility.Excel;

public class GrowwLoginTest {
	WebDriver driver;

	@BeforeMethod
	public void launchBrowser() {
		Pojo.Browser.Chrome("https://groww.in/");
	}

	@Test
	public void LoginWithValidCredencials() throws IOException {
		GrowwLogin growwlogin = new GrowwLogin(driver);
		growwlogin.ClickOnLogin();
		String uid = Excel.getData(7, 1, "ABC");
		growwlogin.EnterEmailID(uid);
		growwlogin.Cntinue();
		String pass = Excel.getData(8, 1, "ABC");
		growwlogin.EnterPassword(pass);
		growwlogin.Submit();
		String pin = Excel.getData(9, 1, "ABC");
		growwlogin.EnterPIN(pin);

	}

}
