package leetcode;

import java.util.Arrays;

// 1. Two Sum
// Given an array of integers nums and an integer target, 
// return indices of the two numbers such that they add up to target.
// You may assume that each input would have exactly one solution,
// and you may not use the same element twice.
//You can return the answer in any order.

public class leetCode01 {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] {i,j};
                }
            }
        }
        return new int[]{};
    }
    
    public static void main(String[] args) {
		leetCode01 lc = new leetCode01();
		int[]nums = {2,7,11,15};
		int target = 9;
		lc.twoSum(nums, target);
		System.out.println(Arrays.toString(lc.twoSum(nums, target)));
	}
}
