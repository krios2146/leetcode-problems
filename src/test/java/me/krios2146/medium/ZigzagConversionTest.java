package me.krios2146.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ZigzagConversionTest {

    private final ZigzagConversion test = new ZigzagConversion();

    @Test
    void convert_shouldReturnExpected() {
        String s = "PAYPALISHIRING";
        int numRows = 3;
        String expected = "PAHNAPLSIIGYIR";

        String actual = test.convert(s, numRows);

        assertEquals(expected, actual);
    }

    @Test
    void convert_shouldReturnExpected2() {
        String s = "PAYPALISHIRING";
        int numRows = 4;
        String expected = "PINALSIGYAHRPI";

        String actual = test.convert(s, numRows);

        assertEquals(expected, actual);
    }

    @Test
    void convert_shouldReturnExpected3() {
        String s = "A";
        int numRows = 1;
        String expected = "A";

        String actual = test.convert(s, numRows);

        assertEquals(expected, actual);
    }

}