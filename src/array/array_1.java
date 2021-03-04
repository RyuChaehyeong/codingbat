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

	public int[] makePi() {
		return new int[] { 3, 1, 4 };
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

	public boolean double23(int[] nums) {
		if (nums.length == 2) {
			if (nums[0] == 2 && nums[1] == 2) {
				return true;
			}

			if (nums[0] == 3 && nums[1] == 3) {
				return true;
			}
		}

		return false;
	}

	public int[] fix23(int[] nums) {
		for (int a = 0; a < nums.length - 1; a++) {
			if (nums[a] == 2 && nums[a + 1] == 3) {
				nums[a + 1] = 0;
			}
		}

		return nums;
	}

	public int start1(int[] a, int[] b) {
		int cnt = 0;

		if (a.length > 0 && a[0] == 1) {
			cnt++;
		}

		if (b.length > 0 && b[0] == 1) {
			cnt++;
		}

		return cnt;
	}

	public int[] biggerTwo(int[] a, int[] b) {

		if (a[0] == b[0] && a[1] < b[1]) {
			return b;
		}

		if (a[0] < b[0] && a[1] == b[1]) {
			return b;
		}

		if (a[0] < b[0] && a[1] < b[1]) {
			return b;
		}

		return a;
	}

	public int[] makeMiddle(int[] nums) {

		int len = nums.length;
		int[] mid = new int[2];

		if (len == 2) {
			return nums;

		} else if (len >= 4) {
			mid[0] = nums[len / 2 - 1];
			mid[1] = nums[len / 2];
			return mid;
		}

		return null;

	}

	public int[] plusTwo(int[] a, int[] b) {
		int[] plus = new int[4];
		int x = 0;
		plus[x++] = a[0];
		plus[x++] = a[1];
		plus[x++] = b[0];
		plus[x] = b[1];

		return plus;
	}

	public int[] swapEnds(int[] nums) {

		if (nums.length > 1) {

			int temp_first = nums[0];
			int temp_last = nums[nums.length - 1];

			nums[0] = temp_last;
			nums[nums.length - 1] = temp_first;

		}

		return nums;

	}

	public int[] midThree(int[] nums) {
		int[] mid3 = new int[3];

		int first = (nums.length - 3) / 2;

		for (int a = 0; a < mid3.length; a++) {
			mid3[a] = nums[first++];
		}

		return mid3;
	}

	public int maxTriple(int[] nums) {

		if (nums.length == 1) {
			return nums[0];
		}

		// 1,2,3 -- 3 | 0, 1, 2
		// 1,2,3,4,5 -- 5 | 0, 2, 4
		// 1,2,3,4,5,6,7 -- 7 | 0, 3, 6

		if (nums.length >= 3) {
			int[] odd = new int[3];
			odd[0] = nums[0];
			odd[1] = nums[(nums.length - 1) / 2];
			odd[2] = nums[nums.length - 1];

			int max = odd[0];
			for (int res : odd) {
				max = res > max ? res : max;
			}

			return max;

		}

		return 0;
	}

	public int[] frontPiece(int[] nums) {
		if (nums.length < 3) {
			return nums;

		} else {

			int[] two = new int[2];
			two[0] = nums[0];
			two[1] = nums[1];

			return two;
		}

	}

	public boolean unlucky1(int[] nums) {

		if (nums.length >= 2) {

			if (nums[0] == 1 && nums[1] == 3) {
				return true;
			}

			if (nums[1] == 1 && nums[2] == 3) {
				return true;
			}
		}

		if (nums.length >= 3) {

			if (nums[nums.length - 2] == 1 && nums[nums.length - 1] == 3) {
				return true;
			}
		}

		return false;

	}

	public int[] make2(int[] a, int[] b) {

		int[] two = new int[2];

		if (a.length > 1) {
			two[0] = a[0];
			two[1] = a[1];

		} else if (a.length == 1) {
			two[0] = a[0];
			two[1] = b[0];

		} else if (a.length == 0) {
			two[0] = b[0];
			two[1] = b[1];
		}

		return two;
	}

	public int[] front11(int[] a, int[] b) {

		if (a.length > 0 && b.length > 0) {
			return new int[] { a[0], b[0] };
		}

		if (a.length > 0 && b.length == 0) {
			return new int[] { a[0] };
		}

		if (a.length == 0 && b.length > 0) {
			return new int[] { b[0] };
		}

		return new int[] {};
	}

}