package Collextion;

import java.util.Arrays;
import java.util.Scanner;

import org.testng.annotations.Test;

public class ArrayMethodPassing {

	private static Scanner scanner = new Scanner(System.in);

	@Test
	public void mainMethod() {
		int[] myIntegers = getIntegers(5);
		for (int i = 0; i < myIntegers.length; i++) {
			
			System.out.println("Element " + i + ", typed value was " + myIntegers[i]);
			for(int k=i+1;k<myIntegers.length;k++) {
				if(i>myIntegers.length) {
					System.out.println(myIntegers[i]);
				}
				
			}
		}

		System.out.println(Arrays.toString(myIntegers));
		
	}

	public int[] getIntegers(int number) {
		System.out.println("Enter " + number + " integer values:\r ");
		int[] values = new int[number];

		for (int i = 0; i < values.length; i++) {
			values[i] = scanner.nextInt();
		}

		return values;
	}

}
