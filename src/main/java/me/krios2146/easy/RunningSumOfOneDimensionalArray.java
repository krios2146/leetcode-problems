package me.krios2146.easy;

public class RunningSumOfOneDimensionalArray {
    public int[] runningSum(int[] nums) {
        int[] sums = new int[nums.length];

        int num = 0;
        for (int i = 0; i < nums.length; i++) {
            int sum = num + nums[i];
            sums[i] = sum;
            num = sum;
        }

        return sums;
    }
}
