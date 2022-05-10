package Utility;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {
	public static WebDriver SS(WebDriver driver) throws IOException {

		File SS = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		String d = ScreenShot.date();
		File Location = new File("D:\\Selenium\\KiteZerodha\\ScreenShots\\" + d + ".jpg");

		FileHandler.copy(SS, Location);
		return driver;

	}

	public static String date() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MMM-dd HH-mm-ss");
		LocalDateTime now = LocalDateTime.now();
		String d = dtf.format(now);
		return d;
	}
}
