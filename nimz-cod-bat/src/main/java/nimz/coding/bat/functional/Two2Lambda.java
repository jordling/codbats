package nimz.coding.bat.functional;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Two2Lambda {

    public static void main(String args[]) {
//Given a list of non-negative integers, return a list of those numbers multiplied by 2, omitting any of the resulting numbers that end in 2.

	List<Integer> nums = Arrays.asList(9, 11, 29, 3); // it is immutable
	System.out.println(two2(nums));

    }

    private static List<Integer> two2(List<Integer> nums) {
	return nums.stream()
	           .map(n -> n * 2)
	           .filter(n -> n % 10 != 2)
	           .collect(Collectors.toList());

    }
}
