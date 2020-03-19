package TestCases;


	import java.awt.List;
import java.net.MalformedURLException;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Utitily.BaseClass;
import io.appium.java_client.TouchAction;
	import io.appium.java_client.android.AndroidDriver;
	import io.appium.java_client.android.AndroidElement;
	import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
	import static io.appium.java_client.touch.offset.ElementOption.element;


	public class DragDropdemo extends BaseClass{
		  java.util.List<AndroidElement>  source;
@Test
		
		public void DragnDrop() throws MalformedURLException {
			// TODO Auto-generated method stub
			AndroidDriver<AndroidElement> driver=capabilities();
		     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		     
		     driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		     driver.findElementByXPath("//android.widget.TextView[@text='Drag and Drop']").click();
		     source=driver.findElementsByClassName("android.view.View");
		     WebElement destination=driver.findElementsByClassName("android.view.View").get(1);
		     
		     
		     TouchAction t = new TouchAction(driver);
		     //longpress(source)/move(destination)//release
		 //    t.longPress(longPressOptions().withElement(element(source))).moveTo(element(destination)).release().perform();
		     t.longPress(element(source.get(0))).moveTo(element(destination)).release().perform();
		     
		

		}

	}


