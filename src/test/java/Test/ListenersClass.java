package Test;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

import Utility.ScreenShot;

public class ListenersClass extends driverr implements ITestListener {

	public void testStart(ITestResult result) {
		System.out.println("Started" + result.getName());
	}

	public void testSuccess(ITestResult result) {
		System.out.println("Successful" + result.getName());
	}

	public void testFaild(ITestResult result) {
		try {
			System.out.println("Successful" + result.getName());
			ScreenShot.SS(driver);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	public void testSkipped(ITestResult result) {
		System.out.println("Skipped" + result.getName());
	}

}
