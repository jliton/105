package Enum;

import org.testng.annotations.Test;

public class EnaumEx {
	enum Color 
	{ 
	    RED, GREEN, BLUE; 
	} 
@Test
public void callmethod() {
	
	System.out.println(Color.GREEN);
	
	
}

}
