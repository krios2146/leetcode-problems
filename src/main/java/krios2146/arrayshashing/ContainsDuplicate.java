package krios2146.arrayshashing;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> uniqueNumbers = new HashSet<>();

        for (int number : nums) {
            if (uniqueNumbers.contains(number)) {
                return true;
            }
            uniqueNumbers.add(number);
        }

        return false;
    }
}
