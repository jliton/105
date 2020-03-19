package Execute_TestCases;

import static io.appium.java_client.touch.offset.ElementOption.element;

import java.io.IOException;
import java.net.MalformedURLException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Helper.Emulator_Test9;
import Helper.Server;
import POM.LandingPage;
import Utitily.BaseClass;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class VerifyUserAble_to_Drag_and_drop extends BaseClass {

	@BeforeTest
	public void Emulator() throws InterruptedException, IOException {
		new Server().serverStart();

		new Emulator_Test9().EmulatorStart();
	}

	@Test
	public void DragAndDrop() throws MalformedURLException {
		AndroidDriver<AndroidElement> driver = capabilities();
		// driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		LandingPage LP = new LandingPage(driver);
		LP.views.click();
		LP.DragNDrop.click();
		TouchAction ta = new TouchAction(driver);
		// longpress(source)/move(destination)//release
//    t.longPress(longPressOptions().withElement(element(source))).moveTo(element(destination)).release().perform();
		ta.longPress(element(LP.Source.get(0))).moveTo(element(LP.Destination.get(1))).release().perform();

	}

	@AfterTest
	public void afterAllTest() throws IOException, InterruptedException {
		new Server().ServerStop();
		new Emulator_Test9().EmulatorKill();

	}
}