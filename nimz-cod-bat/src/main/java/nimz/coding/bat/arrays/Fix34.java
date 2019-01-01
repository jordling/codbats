package nimz.coding.bat.arrays;

public class Fix34 {

    public static void main(String args[]) {

//Return an array that contains exactly the same numbers as the given array, but rearranged so that every 3 is immediately followed by a 4.
//Do not move the 3's, but every other number may move. The array contains the same number of 3's and 4's, every 3 has a number after it that is not a 3, 
//and a 3 appears in the array before any 4.



	int arr[] = fix34(new int[] { 1, 3, 1, 4, 4, 3, 1 });
	for (int i : arr) {
	    System.out.print(i+",");

	}

    }

    public static int[] fix34(int[] nums) {
	    for (int i = 0; i < nums.length; i++){
	        if (nums[i] == 3) {
		int temp = nums[i + 1];
	            nums[i + 1] = 4;
	            for (int j = i + 2; j < nums.length; j++)
	                if (nums[j] == 4){
	                  nums[j] = temp;
	                  
	                }
	        }
	      
	    }
	    return nums;
    }

    
    
}
