package nimz.coding.bat;

public class FizzBuzz {

	public static void main(String args[]) {
		// fizzBuzz(new int[] { 1, 10 });
		// fizzBuzzAlt(new int[] { 1, 10 });
		System.out.println(fizzBuzzStr(11, 16));
	}

	public static String fizzBuzzStr(int start, int end) {
		String s = "";
		for (int i = start; i < end; i++) {
//			if (i % 3 == 0) {
//				if (i % 5 == 0) {
//					s += "FizzBuzz ";
//				} else {
//					s += "Fizz ";
//				}
//			} else if (i % 5 == 0) {
//				s += "Buzz ";
//			} else {
//				s += String.valueOf(i) + " ";
//			}

			s += i % 3 == 0 ? (i % 5 == 0 ? "FizzBuzz " : "Fizz ") : (i % 5 == 0 ? "Buzz " : i+" ");

		}

		return s;
	}

	public static String[] fizzBuzz(int arrayBoundry[]) {

		String[] strs = new String[arrayBoundry[1] - arrayBoundry[0]];
		for (int i = arrayBoundry[0]; i < arrayBoundry[1]; i++) {
			strs[i - arrayBoundry[0]] = "";
			if (i % 3 == 0) {
				strs[i - arrayBoundry[0]] += "Fizz";
			}
			if (i % 5 == 0) {
				strs[i - arrayBoundry[0]] += "Buzz";
			}
			if (strs[i - arrayBoundry[0]] == "") {
				strs[i - arrayBoundry[0]] += String.valueOf(i);
			}

			System.out.println("strs[" + i + "-" + arrayBoundry[0] + "]=" + strs[i - arrayBoundry[0]]);
		}
		return strs;

	}

	public static String[] fizzBuzzAlt(int arrayBoundry[]) {

		String[] a = new String[arrayBoundry[1] - arrayBoundry[0]];

		int i = arrayBoundry[0];
		int j = 0;
		while (i < arrayBoundry[1]) {

			if (i % 3 == 0 && i % 5 == 0) {
				a[j] = "FizzBuzz";
			} else if (i % 3 == 0) {
				a[j] = "Fizz";

			} else if (i % 5 == 0) {
				a[j] = "Buzz";
			} else {

				a[j] = String.valueOf(i);
			}

			System.out.println("a[" + j + "]=" + a[j]);
			i++;
			j++;

		}

		return a;

	}
}
