package com.kn.tip.problem.leetcode;

/**
 * You are a professional robber planning to rob houses along a street. Each house has a certain
 * amount of money stashed, the only constraint stopping you from robbing each of them is that
 * adjacent houses have security system connected and it will automatically contact the police if
 * two adjacent houses were broken into on the same night.
 *
 * Given a list of non-negative integers representing the amount of money of each house, determine
 * the maximum amount of money you can rob tonight without alerting the police.
 *
 * Not a greedy problem but a dynamic programming.
 */
public class HouseRobber {
  public static int rob(final int[] nums) {
    if (nums.length == 0) {
      return 0;
    }

    if (nums.length == 1) {
      return nums[0];
    }

    // each element is max money that can get by either robbed current house + maxSum[i-2]
    // or carry from maxSum[i-1]
    int[] maxSum = new int[nums.length];
    maxSum[0] = nums[0];

    for (int i = 1; i < nums.length; i++) {
      maxSum[i] = nums[i];

      if (i - 2 >= 0) {
        maxSum[i] += maxSum[i - 2];
      }

      maxSum[i] = Math.max(maxSum[i], maxSum[i - 1]);
    }

    return maxSum[nums.length - 1];
  }

  public static void main(String[] args) {
    System.out.println(rob(new int[] {2, 3, 2}));
    System.out.println(rob(new int[] {2, 1, 1, 2}));
  }
}
