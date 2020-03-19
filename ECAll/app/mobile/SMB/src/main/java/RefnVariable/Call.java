package RefnVariable;

import java.util.Arrays;

public class Call extends RefArray {
	int[]abc=cd;
	@org.testng.annotations.Test
	public void calling() {
		Test(abc);
		System.out.println(Arrays.toString(abc));
		
	}
	
	public void Test(int[] array) {
		
		array[0]=8;
	}

}
