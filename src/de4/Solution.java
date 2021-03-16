package de4;

public class Solution { // Find fibonacci
	public static void main(String[] args) {
		int n = 3;
		System.out.println(climbStairs(n));
	}

	public static int climbStairs(int n) {
		double sqrt5 = Math.sqrt(5);
		double fibn = Math.pow((1 + sqrt5) / 2, n + 1) - Math.pow((1 - sqrt5) / 2, n + 1);
		return (int) (fibn / sqrt5);
	}
}
