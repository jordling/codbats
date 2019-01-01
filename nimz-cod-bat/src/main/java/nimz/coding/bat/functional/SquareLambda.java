package nimz.coding.bat.functional;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SquareLambda {

    public static void main(String args[]) {
//Given a list of integers, return a list of those numbers squared and the product added to 10, omitting any of the resulting numbers that end in 5 or 6.

	List<Integer> nums = Arrays.asList(3, 1, 4);
	System.out.println(square56(nums));

    }

    private static List<Integer> square56(List<Integer> nums) {
	return nums.stream()
	           .map(n -> (n * n) + 10)
	           .filter(n -> n % 10 != 5 && n % 10 != 6)
	           .collect(Collectors.toList());
    }
}
