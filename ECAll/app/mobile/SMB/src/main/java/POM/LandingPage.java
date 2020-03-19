package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LandingPage {

	public LandingPage(AndroidDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Views']")
	public WebElement views;
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Drag and Drop']")
	public WebElement DragNDrop;
	@AndroidFindBy(className="android.view.View")
	public java.util.List<AndroidElement> Source;
	@AndroidFindBy(className="android.view.View")
	public java.util.List<AndroidElement> Destination;
	@AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"))")
	public WebElement Scroll;
	}

