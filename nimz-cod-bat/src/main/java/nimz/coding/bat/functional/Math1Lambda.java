package nimz.coding.bat.functional;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Math1Lambda {

    public static void main(String args[]) {
//Given a list of integers, return a list where each integer is added to 1 and the result is multiplied by 10.


	List<Integer> nums = Arrays.asList(1, 2, 3);
	System.out.println(math1(nums));
	
    }

    private static List<Integer> math1(List<Integer> nums) {
	return nums.parallelStream()
	           .map(e -> (e + 1) * 10)
	           .collect(Collectors.toList());

    }
}
