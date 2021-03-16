package de1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
	public static void main(String[] args) {
		int[] nums1 = { 4, 9, 5 };
		int[] nums2 = { 9, 4, 9, 8, 4 };
		System.out.println(Arrays.toString(intersection(nums1, nums2)));
	}

	public static int[] intersection(int[] nums1, int[] nums2) {
		Set<Integer> set = new HashSet<>();
		for (int i : nums1) {
			set.add(i);
		}

		List<Integer> result = new ArrayList<>();
		for (int i : nums2) {
			if (set.contains(i)) {
				result.add(i);
				set.remove(i);
			}
		}

		int[] arrResult = new int[result.size()];
		for (int i = 0; i < result.size(); i++) {
			arrResult[i] = result.get(i);
		}
		return arrResult;
	}
}
