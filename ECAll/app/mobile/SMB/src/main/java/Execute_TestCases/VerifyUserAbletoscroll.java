package Execute_TestCases;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import POM.LandingPage;
import Utitily.BaseClass;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class VerifyUserAbletoscroll extends BaseClass {
	
	AndroidDriver<AndroidElement> driver;
	
	@Test
	
	public void ScrollingDemo() throws MalformedURLException {
		// TODO Auto-generated method stub
		driver = capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		LandingPage LP=new LandingPage(driver);
		LP.views.click();
		
		//driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		// Appium do not support scrolling -executing androidcode with in
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));");

	}

}
