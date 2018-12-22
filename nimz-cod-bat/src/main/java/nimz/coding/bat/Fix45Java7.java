package nimz.coding.bat;

public class Fix45Java7 {

	public static void main(String args[]) {

		int arr[] = fix45Method(new int[] { 1, 5, 4, 7 });
		for(int i:arr) {
			System.out.println(i);

		}
	}

	public static int[] fix45Method(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 5) {
				int pos5 = i;
				for (int j = 0; j < nums.length; j++)
					if (nums[j] == 4 && nums[j + 1] != 5) {
						int temp = nums[j + 1];
						nums[j + 1] = 5;
						nums[pos5] = temp;
						break;
					}
			}
		}
		return nums;
	}
}
