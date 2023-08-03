package me.krios2146.easy;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CountItemsMatchingRuleTest {

    private final CountItemsMatchingRule test = new CountItemsMatchingRule();

    @Test
    void countMatches_shouldReturn1() {
        List<List<String>> testItems = new ArrayList<>();
        testItems.add(List.of("phone", "blue", "pixel"));
        testItems.add(List.of("computer", "silver", "lenovo"));
        testItems.add(List.of("phone", "gold", "iphone"));
        String ruleKey = "color";
        String ruleValue = "silver";

        assertEquals(1, test.countMatches(testItems, ruleKey, ruleValue));
    }

    @Test
    void countMatches_shouldReturn2() {
        List<List<String>> testItems = new ArrayList<>();
        testItems.add(List.of("phone", "blue", "pixel"));
        testItems.add(List.of("computer", "silver", "phone"));
        testItems.add(List.of("phone", "gold", "iphone"));
        String ruleKey = "type";
        String ruleValue = "phone";

        assertEquals(2, test.countMatches(testItems, ruleKey, ruleValue));
    }

    @Test
    void countMatches_shouldReturn3() {
        List<List<String>> testItems = new ArrayList<>();
        testItems.add(List.of("phone", "blue", "pixel"));
        testItems.add(List.of("phone", "silver", "phone"));
        testItems.add(List.of("phone", "gold", "iphone"));
        String ruleKey = "type";
        String ruleValue = "phone";

        assertEquals(3, test.countMatches(testItems, ruleKey, ruleValue));
    }

    @Test
    void countMatches_shouldReturn0() {
        List<List<String>> testItems = new ArrayList<>();
        testItems.add(List.of("phone", "blue", "pixel"));
        testItems.add(List.of("phone", "silver", "phone"));
        testItems.add(List.of("phone", "gold", "iphone"));
        String ruleKey = "type";
        String ruleValue = "computer";

        assertEquals(0, test.countMatches(testItems, ruleKey, ruleValue));
    }
}