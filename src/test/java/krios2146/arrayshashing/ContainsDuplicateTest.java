package krios2146.arrayshashing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ContainsDuplicateTest {

    private final ContainsDuplicate underTest = new ContainsDuplicate();

    @Test
    void arrayWithDuplicate_true() {
        int[] nums = new int[]{1, 2, 3, 1};

        assertTrue(underTest.containsDuplicate(nums));
    }

    @Test
    void arrayWithoutDuplicate_false() {
        int[] nums = new int[]{1, 2, 3, 4};

        assertFalse(underTest.containsDuplicate(nums));
    }

    @Test
    void arrayWithMultipleDuplicate_true() {
        int[] nums = new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2};

        assertTrue(underTest.containsDuplicate(nums));
    }
}