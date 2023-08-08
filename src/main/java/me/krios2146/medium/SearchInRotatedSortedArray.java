package me.krios2146.medium;

import java.util.Arrays;

public class SearchInRotatedSortedArray {
    public int search(int[] nums, int target) {
        int index = -1;
        int left = 0;
        int right = nums.length - 1;
        int mid = (right - left + 1) / 2;

        if (nums[mid] == target) {
            return mid;
        }
        if (nums[left] == target) {
            return left;
        }
        if (nums[right] == target) {
            return right;
        }

        // array is sorted
        if (nums[left] < nums[right]) {
            int i = Arrays.binarySearch(nums, target);
            return i > 0 ? i : index;
        }

        // right side is sorted
        if (nums[right] > nums[mid]) {
            // target in the sorted array
            if (target > nums[mid] && target < nums[right]) {
                int i = Arrays.binarySearch(Arrays.copyOfRange(nums, mid, right + 1), target);
                return i > 0 ? i + mid : index;
            } else {
                return search(Arrays.copyOfRange(nums, left, mid), target);
            }
        }

        // left side is sorted
        if (nums[mid] > nums[left]) {
            // target in the sorted array
            if (target > nums[left] && target < nums[mid]) {
                int i = Arrays.binarySearch(Arrays.copyOfRange(nums, left, mid), target);
                return i > 0 ? i : index;
            } else {
                int i = search(Arrays.copyOfRange(nums, mid, right + 1), target);
                return i > 0 ? i + mid : index;
            }
        }

        return index;
    }
}
