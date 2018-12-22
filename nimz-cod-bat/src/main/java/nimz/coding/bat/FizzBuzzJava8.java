package nimz.coding.bat;

import java.util.Arrays;
import java.util.stream.IntStream;

public class FizzBuzzJava8 {

	public static void main(String args[]) {

		int start = 10;
		int end = 15;
		IntStream.rangeClosed(start, end)
				.mapToObj((i) -> i % 3 == 0 ? (i % 5 == 0 ? "FizzBuzz" : "Fizz") : (i % 5 == 0 ? "Buzz" : i))
				.forEach(System.out::println);
//
//		IntStream.rangeClosed(0, 100).forEach(i -> {
//			StringBuffer bfr = new StringBuffer();
//			if (i % 3 == 0)
//				bfr.append("Fizz");
//			if (i % 5 == 0)
//				bfr.append("Buzz");
//			if (i % 3 != 0 && i % 5 != 0)
//				bfr.append(i);
//
//			System.out.println(bfr.toString());
//		});

		//System.out.println(fizzBuzzStr(10, 15));
	}

	public String[] fizzBuzz(int arrayBoundry[]) {

		String[] strs = new String[arrayBoundry[1] - arrayBoundry[0]];
		System.out.println("strs array" + Arrays.toString(strs));
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

	public static String fizzBuzzStr(int start, int end) {

		String strs = "";
		for (int i = start; i <= end; i++) {
			if (i % 3 == 0) {
				if (i % 5 == 0) {
					strs += "FizzBuzz\n";
				} else {
					strs += "Fizz\n";
				}
			} else if (i % 5 == 0) {

				strs += "Buzz\n";
			}

			else {
				strs += String.valueOf(i) + "\n";
			}

		}
		return strs;

	}

	public String[] fizzBuzzAlt(int arrayBoundry[]) {

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
