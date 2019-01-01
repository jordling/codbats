package nimz.coding.bat.arrays;

public class MaxSpan {

    public static void main(String[] args) {

//Consider the leftmost and righmost appearances of some value in an array. We'll say that the "span" is the number of elements between the two inclusive.
//A single value has a span of 1. Returns the largest span found in the given array. (Efficiency is not a priority.)

	int[] nums = { 1, 4, 2, 1, 4, 1, 4 };

	System.out.println(maxSpan(nums));

    }

    public static int maxSpan(int[] nums) {
	int count = 0;
	int maxSpan = 0;
	for (int i = 0; i < nums.length; i++) {
	    for (int j = 0; j < nums.length; j++) {
		System.out.println("RUN J=" + j + "  & i=" + i);
		if (nums[i] == nums[j]) {
		    System.out.println("nums[i" + nums[i] + "]==nums[j" + nums[j] + "]");

		    count = j - i + 1;// increment count
		    maxSpan = Math.max(maxSpan, count);
		    System.out.println("count==" + count);
		    System.out.println("maxSpan==" + maxSpan);

		}

	    }
	}
	return maxSpan;
    }

}
