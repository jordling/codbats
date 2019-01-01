package nimz.coding.bat.arrays;

public class FizzBuzz {

    public static void main(String args[]) {
//This is slightly more difficult version of the famous FizzBuzz problem which is sometimes given as a first problem for job interviews.
// Consider the series of numbers beginning at start and running up to but not including end, so for example start=1 and end=5 gives the series 1, 2, 3, 4. 
//Return a new String[] array containing the string form of these numbers, except for multiples of 3, 
//use "Fizz" instead of the number, for multiples of 5 use "Buzz", and for multiples of both 3 and 5 use "FizzBuzz". In Java, 
//String.valueOf(xxx) will make the String form of an int or other type. 
//This version is a little more complicated than the usual version since you have to allocate and index into an array instead of just printing,
//and we vary the start/end instead of just always doing 1..100.

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

	    s += i % 3 == 0 ? (i % 5 == 0 ? "FizzBuzz " : "Fizz ") : (i % 5 == 0 ? "Buzz " : i + " ");

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
