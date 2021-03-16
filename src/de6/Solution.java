package de6;

public class Solution {
	public static void main(String[] args) {
		int[] height = { 4, 3, 2, 1, 4 };
		System.out.println(maxArea(height));
	}

	public static int maxArea(int[] height) {
		int maxarea = 0;
		int left = 0;
		int right = height.length - 1;
		while (left < right) {
			maxarea = Math.max(maxarea, Math.min(height[left], height[right]) * (right - left));
			if (height[left] < height[right]) {
				left++;
			} else {
				right--;
			}
		}
		return maxarea;
	}
}