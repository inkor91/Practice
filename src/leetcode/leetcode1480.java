package leetcode;

import java.util.Arrays;

// 1480. Running Sum of 1d Array
//Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]¡¦nums[i]).
//Return the running sum of nums.

public class leetcode1480 {
	public int[] runningSum(int[] nums) {
		int[]result = new int[nums.length];
		int temp = 0;
		
		for(int i=0; i < nums.length; i++){
			temp += nums[i];
			result[i] = temp;
		}
		
		return result;	
	}
	
	public static void main(String[] args) {
		leetcode1480 ls = new leetcode1480();
		int[]nums = {1,2,3,4};
		ls.runningSum(nums);
		System.out.println(Arrays.toString(ls.runningSum(nums)));
	}
}
