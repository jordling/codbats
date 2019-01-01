package nimz.coding.bat.functional;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NoNegLambda {

    public static void main(String args[]) {
	//Given a list of integers, return a list of the integers, omitting any that are less than 0.


	List<Integer> nums = Arrays.asList(9, 19, 29,3); // it is immutable
	System.out.println(no9(nums));

    }

    private static List<Integer> no9(List<Integer> nums) {

	    return nums.stream()
	               .filter(n->n%10!=9)
	               .collect(Collectors.toList());


    }
}
