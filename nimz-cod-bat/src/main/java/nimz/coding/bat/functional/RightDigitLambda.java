package nimz.coding.bat.functional;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RightDigitLambda {

    public static void main(String args[]) {

//Given a list of non-negative integers, return an integer list of the rightmost digits. (Note: use %)

	List<Integer> nums = Arrays.asList(1, 22, 93);
	System.out.println(rightDigit(nums));

    }

    private static List<Integer> rightDigit(List<Integer> nums) {
	return nums.stream()
	           .map(e -> e % 10)
	           .collect(Collectors.toList());

    }
}
