package me.krios2146.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ZigzagConversion {
    public String convert(String s, int numRows) {
        if (s.length() == 1 || numRows == 1) {
            return s;
        }
        Map<Integer, List<Character>> rows = new HashMap<>();

        int currentRow = 0;
        boolean isRowAscending = true;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            List<Character> charsInRow = rows.getOrDefault(currentRow, new ArrayList<>());
            charsInRow.add(c);
            rows.put(currentRow, charsInRow);

            if (isRowAscending) {
                currentRow++;
            } else {
                currentRow--;
            }
            if (currentRow == numRows - 1 || currentRow == 0) {
                isRowAscending = !isRowAscending;
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < numRows; i++) {
            rows.getOrDefault(i, new ArrayList<>()).forEach(sb::append);
        }

        return sb.toString();
    }
}
