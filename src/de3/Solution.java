package de3;

public class Solution {
	public static void main(String[] args) {
		int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		System.out.println(maxSubArraySum(nums));
	}

	static int maxSubArraySum(int a[]) {
		int result = Integer.MIN_VALUE;
		int maxArray = 0;

		for (int i = 0; i < a.length; i++) {
			maxArray = maxArray + a[i];
			if (result < maxArray) {
				result = maxArray;
			}
			if (maxArray < 0) {
				maxArray = 0;
			}
		}
		return result;
	}
}
