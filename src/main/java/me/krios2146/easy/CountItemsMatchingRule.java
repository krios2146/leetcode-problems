package me.krios2146.easy;

import java.util.HashMap;
import java.util.List;

public class CountItemsMatchingRule {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        HashMap<String, Integer> characteristics = new HashMap<>();
        characteristics.put("type", 0);
        characteristics.put("color", 1);
        characteristics.put("name", 2);

        int matchingItems = 0;

        for (List<String> item : items) {
            Integer characteristicIndex = characteristics.get(ruleKey);
            if (item.get(characteristicIndex).equals(ruleValue)) {
                matchingItems++;
            }
        }

        return matchingItems;
    }
}
