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

	public int[] maxEnd3(int[] nums) {

		// set all the other elements to be largest number
		/*
		 * int max = nums[0]; for (int comp = 1; comp < nums.length; comp++) { if (max <
		 * nums[comp]) { max = nums[comp]; }
		 * 
		 * }
		 */

		int max = nums[0] > nums[2] ? nums[0] : nums[2];

		int maxArr[] = new int[3];
		for (int a = 0; a < maxArr.length; a++) {
			maxArr[a] = max;
		}

		return maxArr;
	}

	public int sum2(int[] nums) {
		int res = 0;

		if (nums.length >= 2) {
			res = nums[0] + nums[1];
		} else if (nums.length == 1) {
			res = nums[0];
		} else {
			res = 0;
		}

		return res;
	}

	public int[] middleWay(int[] a, int[] b) {
		int[] mid = new int[2];

		mid[0] = a[1];
		mid[1] = b[1];

		return mid;
	}

	public int[] makeEnds(int[] nums) {
		int[] ends = new int[2];

		ends[0] = nums[0];
		ends[1] = nums[nums.length - 1];

		return ends;
	}

	public boolean has23(int[] nums) {
		boolean res = false;

		if (nums[0] == 2 || nums[0] == 3) {
			res = true;
		} else if (nums[1] == 2 || nums[1] == 3)
			res = true;

		return res;
	}

	public boolean no23(int[] nums) {
		boolean res = true;

		if (nums[0] == 2 || nums[0] == 3) {
			res = false;
		}

		if (nums[1] == 2 || nums[1] == 3) {
			res = false;
		}

		return res;
	}

	public int[] makeLast(int[] nums) {
		int[] last = new int[nums.length * 2];

		last[last.length - 1] = nums[nums.length - 1];

		return last;
	}

}
