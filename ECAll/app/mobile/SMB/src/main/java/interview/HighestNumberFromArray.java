 package interview;

public class HighestNumberFromArray {

	public static void main(String[] args) {
		int max;
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				// changing arr[i]<min will give small number in array
				max = arr[i];

			}
		}
	
	System.out.println("Higest Number :"+max);
	}
}
