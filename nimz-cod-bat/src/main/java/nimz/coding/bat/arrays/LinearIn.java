package nimz.coding.bat.arrays;

public class LinearIn {

    public static void main(String args[]) {

//Given two arrays of ints sorted in increasing order, outer and inner, return true if all of the numbers in inner appear in outer. 
//The best solution makes only a single "linear" pass of both arrays, taking advantage of the fact that both arrays are already in sorted order.

	int outer[] = { 1, 3, 4, 6, 7, 8 };
	int inner[] = { 3, 6, 7 };

	System.out.print(linearIn(outer, inner));

    }

    public static boolean linearIn(int[] outer, int[] inner) {
	int count = 0;
	for (int i = 0; i < inner.length; i++) {
	    for (int j = 0; j < outer.length; j++) {
		if (inner[i] == outer[j]) {
		    count++;
		    break;
		}
	    }
	}

	return count == inner.length;
    }

}
