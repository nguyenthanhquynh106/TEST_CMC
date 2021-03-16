# TEST_CMC
[Threads](file:///D:/Interview-Question_v1.pdf)
### 1. Intersection
Given two arrays, write a function to compute their intersection.
Example 1:
Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]
Example 2:
Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
Note:
• Each element in the result must be unique.
• The result can be in any order.
### 2. Two Sum
Given an array of integers that is already sorted in ascending order, find two numbers such that they
add up to a specific target number.
The function twoSum should return indices of the two numbers such that they add up to the target,
where index1 must be less than index2.
Note:
• Your returned answers (both index1 and index2) are not zero-based.
• You may assume that each input would have exactly one solution and you may not use
the same element twice.
Example 1:
Input: numbers = [2,7,11,15], target = 9
Output: [1,2]
Explanation: The sum of 2 and 7 is 9. Therefore index1 = 1, index2 = 2.
Example 2:
Input: numbers = [2,3,4], target = 6
Output: [1,3]
Example 3:
Input: numbers = [-1,0], target = -1
Output: [1,2]
Constraints:
• 2 <= nums.length <= 3 * 104
• -1000 <= nums[i] <= 1000
• nums is sorted in increasing order.
• -1000 <= target <= 1000
### 3. Maximum Subarray
Given an integer array nums, find the contiguous subarray (containing at least one
number) which has the largest sum and return its sum.
Example 1:
Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.
Example 2:
Input: nums = [1]
Output: 1
Example 3:
Input: nums = [0]
Output: 0
Example 4:
Input: nums = [-1]
Output: -1
Example 5:
Input: nums = [-100000]
Output: -100000
Constraints:
• 1 <= nums.length <= 3 * 104
• -105 <= nums[i] <= 105
### 4. Climbing Stair
You are climbing a staircase. It takes n steps to reach the top.
Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
Example 1:
Input: n = 2
Output: 2
Explanation: There are two ways to climb to the top.
1. 1 step + 1 step
2. 2 steps
Example 2:
Input: n = 3
Output: 3
Explanation: There are three ways to climb to the top.
1. 1 step + 1 step + 1 step
2. 1 step + 2 steps
3. 2 steps + 1 step
Constraints:
• 1 <= n <= 45
### 5. Merge Intervals
Given an array of intervals where intervals[i] = [starti, endi], merge all
overlapping intervals, and return an array of the non-overlapping intervals that cover
all the intervals in the input.
Example 1:
Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
Output: [[1,6],[8,10],[15,18]]
Explanation: Since intervals [1,3] and [2,6] overlaps, merge them into [1,6].
Example 2:
Input: intervals = [[1,4],[4,5]]
Output: [[1,5]]
Explanation: Intervals [1,4] and [4,5] are considered overlapping.
Constraints:
• 1 <= intervals.length <= 105
• intervals[i].length == 2
• 0 <= starti <= endi <= 104
### 6. Container With Most Water
Given n non-negative integers a1, a2, ..., an , where each represents a point at
coordinate (i, ai). n vertical lines are drawn such that the two endpoints of the
line i is at (i, ai)and (i, 0). Find two lines, which, together with the x-axis forms a
container, such that the container contains the most water.
Notice that you may not slant the container.
Example 1:
Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49
Explanation: The above vertical lines are represented by array
[1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the
container can contain is 49.
Example 2:
Input: height = [1,1]
Output: 1
Example 3:
Input: height = [4,3,2,1,4]
Output: 16
Example 4:
Input: height = [1,2,1]
Output: 2
Constraints:
• n == height.length
• 2 <= n <= 3 * 105
• 0 <= height[i] <= 3 * 104
### 7. 3Sum
Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0? Find all
unique triplets in the array which gives the sum of zero.
Notice that the solution set must not contain duplicate triplets.
Example 1:
Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]
Example 2:
Input: nums = []
Output: []
Example 3:
Input: nums = [0]
Output: []
Constraints:
• 0 <= nums.length <= 3000
• -105 <= nums[i] <= 105
