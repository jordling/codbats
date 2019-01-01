package nimz.coding.bat.functional;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NoTeenLambda {

    public static void main(String args[]) {
//Given a list of integers, return a list of those numbers, omitting any that are between 13 and 19 inclusive.

	List<Integer> nums = Arrays.asList(12, 13, 19, 20);
	System.out.println(noTeen(nums));

    }

    private static List<Integer> noTeen(List<Integer> nums) {
	return nums.stream()
	           .filter(n -> n < 13 || n > 19)
	           .collect(Collectors.toList());

    }
}
