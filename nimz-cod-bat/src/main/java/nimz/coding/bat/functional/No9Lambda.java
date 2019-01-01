package nimz.coding.bat.functional;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class No9Lambda {

    public static void main(String args[]) {
//Given a list of non-negative integers, return a list of those numbers except omitting any that end with 9. (Note: % by 10)

	List<Integer> nums = Arrays.asList(1, 22, 93);
	System.out.println(rightDigit(nums));

    }

    private static List<Integer> rightDigit(List<Integer> nums) {
	return nums.stream()
	           .map(e -> e % 10)
	           .collect(Collectors.toList());

    }
}
