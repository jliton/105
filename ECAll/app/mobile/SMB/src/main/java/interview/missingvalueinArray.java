package interview;

public class missingvalueinArray {
	public static void main(String[] args) {
		int sum = 0;

		int a[] = { 1, 2, 3, 4, 5 };

		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];

		}

		System.out.println(sum);

		int sum1 = 0;
		int a1[] = { 1, 2, 3, 4, 5 };
		for (int j = 0; j < 6; j++) {

			sum1 = sum1 + a1[j];
		}
		System.out.println(sum1);
	}

}
