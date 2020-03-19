package Helper;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Emulator_Test9 {
	@Test
public void EmulatorStart() throws InterruptedException, IOException {
	String BatFile="C:\\Users\\NEXT\\Desktop\\app\\mobile\\SMB\\src\\main\\java\\Resources\\emulator.bat";
	
	Thread.sleep(5000);
	Runtime.getRuntime().exec(BatFile);
}
	@Test
	public void EmulatorKill() throws IOException {
		
		Runtime.getRuntime().exec("adb -s emulator-5554 emu kill");
	}
}

