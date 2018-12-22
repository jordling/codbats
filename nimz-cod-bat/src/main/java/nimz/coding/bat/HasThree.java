package nimz.coding.bat;

public class HasThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = { 3, 1, 3, 1, 3 };
		haveThree(nums);
	}

	public static boolean haveThree(int[] nums) {
		int threeCounter = 0;
		for (int i = 0; i < nums.length ; i++) {
			System.out.println("num["+i+"]="+nums[i]);
			if (nums[i] == 3) {
				threeCounter++;
				System.out.println("equals 3 =="+nums[i] + "&& Counter"+threeCounter);

			}
			if (nums[i] == 3 && nums[i + 1] == 3) {
				System.out.println("NOT EQ"+nums[i] + "&& Counter"+threeCounter);
				return false;
			}

		}

		return threeCounter == 3;
	}
}
