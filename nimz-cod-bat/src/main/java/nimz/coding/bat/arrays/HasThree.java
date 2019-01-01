package nimz.coding.bat.arrays;

public class HasThree {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	int nums[] = { 3, 1, 3, 1, 3 };
	haveThree(nums);
    }

    public static boolean haveThree(int[] nums) {
	int threeCounter = 0;
	if (nums.length >= 1 && nums[0] == 3)
	    threeCounter++;

	for (int i = 1; i < nums.length; i++) {
	    if (nums[i] == 3) {
		threeCounter++;

	    }
	    if (nums[i - 1] == 3 && nums[i] == 3) {
		return false;
	    }

	}

	return threeCounter == 3;
    }
}
