package TestCases;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.testng.Assert;
import org.testng.annotations.Test;

import Utitily.BaseClass;
import io.appium.java_client.TouchAction;


import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.TapOptions;

import static java.time.Duration.ofSeconds;
import static io.appium.java_client.touch.offset.ElementOption.element;




public class TabingGesture_Tab_LongPress extends BaseClass {
@Test
	public  void TabGesture() throws MalformedURLException {
	
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver=capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		//Tap
		
		WebElement expandList=	driver.findElementByXPath("//android.widget.TextView[@text='Expandable Lists']");
		
		@SuppressWarnings("rawtypes")
		TouchAction action = new TouchAction(driver);
		action.tap(TapOptions.tapOptions().withElement(element(expandList)).withTapsCount(1)).perform();
		driver.findElementByXPath("//android.widget.TextView[@text='1. Custom Adapter']").click();
		WebElement pn=	driver.findElementByXPath("//android.widget.TextView[@text='People Names']");
		action.longPress(LongPressOptions.longPressOptions().withElement(element(pn)).withDuration(ofSeconds(2))).release().perform();
	  boolean ele=driver.findElementById("android:id/title").isDisplayed();
	  Assert.assertTrue(ele, "Did not Displayed");
	
	

	
	
}
}
