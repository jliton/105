package interview;

public class duplicatevalue {
	public static void main(String[] args) {
		String a[] = { "java", "c", "c++", "python", "java" };
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i].equals(a[j])) {
					System.out.println(a[i]);
				}

			}

		}
	}
}
