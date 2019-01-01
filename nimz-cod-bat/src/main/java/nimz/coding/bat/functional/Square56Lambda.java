package nimz.coding.bat.functional;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Square56Lambda {

    public static void main(String args[]) {
//Given a list of integers, return a list where each integer is multiplied with itself.


	List<Integer> nums = Arrays.asList(1, 2, 3);
	System.out.println(square(nums));

    }

    private static List<Integer> square(List<Integer> nums) {
	return nums.stream()
	           .map(e -> e * e)
	           .collect(Collectors.toList());

    }
}
