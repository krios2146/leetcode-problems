package me.krios2146.medium;

public class NumberOfZeroFilledSubarrays {
    public long zeroFilledSubarray(int[] nums) {
        long zeroFilledSubarrays = 0;
        int zeroCounter = 0;
        for (int number : nums) {
            if (number == 0) {
                zeroCounter++;
            } else {
                zeroCounter = 0;
            }
            zeroFilledSubarrays += zeroCounter;
        }

        return zeroFilledSubarrays;
    }
}
