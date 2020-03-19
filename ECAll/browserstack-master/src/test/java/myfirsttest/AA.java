package myfirsttest;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class AA {

			public static void main(String[] args) throws MalformedURLException {
				

				// TODO Auto-generated method stub
			 File appDir = new File("src//main//java");
		     File app = new File(appDir, "ApiDemos-debug.apk");
		     DesiredCapabilities capabilities = new DesiredCapabilities();
		     
		     capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "JabedAVD");
		     capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");
		     capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		     
		     AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
			 
			    
			}
			
			

		

// TODO Auto-generated method stub

}


