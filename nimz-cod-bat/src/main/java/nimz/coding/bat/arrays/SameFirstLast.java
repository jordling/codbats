package nimz.coding.bat.arrays;

public class SameFirstLast {

    public static void main(String[] args) {

//Given an array of ints, return true if 6 appears as either the first or last element in the array. The array will be length 1 or more.

	int[] nums = { 3, 6, 1, 2, 3 }; // true
	// int[] nums = {6, 1, 2, 3}; //false

	System.out.println(sameFirstLast(nums));
    }

    public static boolean sameFirstLast(int[] nums) {
	  return (nums.length>0 && nums[0]==nums[nums.length-1]);
    }

}
