package array;

public class array_1 {

	public boolean firstLast6(int[] nums) {
		if (nums[0] == 6 || nums[nums.length - 1] == 6) {
			return true;
		}
		return false;
	}

	public boolean sameFirstLast(int[] nums) {
		if (nums.length >= 1 && nums[0] == nums[nums.length - 1]) {

			return true;
		}

		return false;
	}

	public boolean commonEnd(int[] a, int[] b) {
		if (a[0] == b[0]) {
			return true;
		} else if (a[a.length - 1] == b[b.length - 1]) {
			return true;
		}

		return false;
	}

	public int sum3(int[] nums) {
		int res = 0;
		/*
		 * 
		 * for (int a : nums) { res += a; }
		 * 
		 * return res;
		 * 
		 */

		for (int a = 0; a < nums.length; a++) {
			res += nums[a];
		}

		return res;
	}

	public int[] rotateLeft3(int[] nums) {
		int[] rot = new int[3];
		rot[0] = nums[1];
		rot[1] = nums[2];
		rot[2] = nums[0];

		return rot;

	}

	public int[] reverse3(int[] nums) {
		int[] rev = new int[3];

		for (int a = 0; a < nums.length; a++) {
			rev[a] = nums[nums.length - 1 - a];

		}

		return rev;
	}

}
