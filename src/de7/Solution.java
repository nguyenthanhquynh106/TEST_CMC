package de7;

import java.util.*;

public class Solution {

	public static void main(String[] args) {
		int a[] = { -1, 0, 1, 2, -1, -4 };
		findTriplets(a);
	}

	public static void findTriplets(int a[]) {
		Arrays.sort(a);
		boolean flag = false;

		for (int i = 0; i < a.length - 2; i++) {
			if (i == 0 || a[i] > a[i - 1]) {
				int start = i + 1;
				int end = a.length - 1;
				int target = -a[i];

				while (start < end) {
					if (start > i + 1 && a[start] == a[start - 1]) {
						start++;
						continue;
					}

					if (end < a.length - 1 && a[end] == a[end + 1]) {
						end--;
						continue;
					}
					if (target == a[start] + a[end]) {
						System.out.print("[" + a[i] + "," + a[start] + "," + a[end] + "] ");
						flag = true;
						start++;
						end--;
					} else if (target > (a[start] + a[end])) {
						start++;
					} else {
						end--;
					}
				}
			}
		}
		if (flag == false) {
			System.out.print("No Such Triplets Exits");
		}
	}
}