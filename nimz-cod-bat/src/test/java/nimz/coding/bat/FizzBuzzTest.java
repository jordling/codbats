package nimz.coding.bat;


import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import nimz.coding.bat.arrays.FizzBuzz;

public class FizzBuzzTest {


	@Test
	public void testFizzBuzz() {
		String expected[] = { "1", "2", "Fizz", "4", "Buzz" };
		int actual[] = { 1, 6 };

		assertArrayEquals(expected, FizzBuzz.fizzBuzz(actual));

	}

	@Test
	public void testFizzBuzzAlt() {
		String expected[] = { "FizzBuzz", "31", "32", "Fizz", "34", "Buzz", "Fizz", "37", "38", "Fizz" };
		int actual[] = { 30, 40 };
		assertArrayEquals(expected, FizzBuzz.fizzBuzzAlt(actual));

	}

	@Test(expected = NullPointerException.class)
	public void testFizzBuzzNull() {
		int input[] = null;

		FizzBuzz.fizzBuzz(input);

	}
	@Test (expected = NegativeArraySizeException.class)
	public void testFizzBuzzNegativeSize() {
		int input[] = {-1,-2};
		FizzBuzz.fizzBuzz(input);

	}

	// WORK IN Junit-5> only
	// @Test
	// void testFizzBuzzNull() {
	// int input[] = null;
	// assertThrows(NullPointerException.class, () -> {
	// fb.fizzBuzz(input);
	// });
	// // OR
	// NullPointerException exception = assertThrows(NullPointerException.class, ()
	// -> {
	// fb.fizzBuzz(input);
	// });
	//
	// assertEquals(null, exception.getMessage());
	// }
	//
	// @Test
	// void testFizzBuzzIllegall() {
	// int input[] = { -1, -2 };
	// assertThrows(NegativeArraySizeException.class, () -> {
	// fb.fizzBuzz(input);
	// });
	//
	// }

}
