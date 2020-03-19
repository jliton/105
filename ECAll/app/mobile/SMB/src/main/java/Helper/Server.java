package Helper;

import java.io.IOException;

import org.testng.annotations.Test;

import io.appium.java_client.service.local.AppiumDriverLocalService;

public class Server {
	public AppiumDriverLocalService appiumServer;
	 

	@Test
	public void serverStart() throws IOException, InterruptedException {
	
		appiumServer = AppiumDriverLocalService.buildDefaultService();
//		String Server="C:\\Users\\NEXT\\Desktop\\app\\mobile\\SMB\\src\\main\\java\\Resources\\appium.bat";
//		Runtime.getRuntime().exec(Server);

		appiumServer.start();

	}

	@Test
	public void ServerStop() {
		appiumServer = AppiumDriverLocalService.buildDefaultService();
		appiumServer.stop();

	}
}
