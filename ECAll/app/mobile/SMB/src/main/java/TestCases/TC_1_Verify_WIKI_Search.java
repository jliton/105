package TestCases;

import java.net.MalformedURLException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import Utitily.BaseClass;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class TC_1_Verify_WIKI_Search extends BaseClass{
	@Test
public void wiki_search() throws MalformedURLException {
	AndroidDriver<AndroidElement>driver=capabilities();
	
	
	driver.findElementByXPath("//android.widget.TextView[@text='Search Wikipedia']").click();
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS) ;
	driver.findElementByXPath("//android.widget.EditText[@resource-id='org.wikipedia.alpha:id/search_src_text']").
	sendKeys("test");
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS) ;//IMPLECIT wait
	//WebDriverWait wait =new WebDriverWait(driver, 20);
	//wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(("//android.widget.TextView[@text='Test']"))));
	
	boolean web=driver.
			findElementByXPath("//android.widget.TextView[@text='Test']").isDisplayed();
	Assert.assertEquals(web, true);
	
	
}
}
