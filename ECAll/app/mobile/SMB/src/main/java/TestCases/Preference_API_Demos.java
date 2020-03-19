package TestCases;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import Utitily.BaseClass;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Preference_API_Demos extends BaseClass{
	boolean ele;
	@Test
	public void testingdemo() throws MalformedURLException {
		AndroidDriver<AndroidElement>driver=capabilities();
		
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
	     driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
	     driver.findElementById("android:id/checkbox").click();
	     driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();
	     driver.findElementByClassName("android.widget.EditText").sendKeys("Android");
	     driver.findElementsByClassName("android.widget.Button").get(1).click();
	     
	     
			
			
		
		
		
	}

}
