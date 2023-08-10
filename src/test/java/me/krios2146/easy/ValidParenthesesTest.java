package me.krios2146.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ValidParenthesesTest {

    private final ValidParentheses test = new ValidParentheses();

    @Test
    void isValid_single() {
        String s = "()";

        Assertions.assertTrue(test.isValid(s));
    }

    @Test
    void isValid_singleInvalid() {
        String s = "(]";

        Assertions.assertFalse(test.isValid(s));
    }

    @Test
    void isValid_inSequence() {
        String s = "()[]{}";

        Assertions.assertTrue(test.isValid(s));
    }

    @Test
    void isValid_three() {
        String s = "()[";

        Assertions.assertFalse(test.isValid(s));
    }

    @Test
    void isValid_nested() {
        String s = "({[]})";

        Assertions.assertTrue(test.isValid(s));
    }

    @Test
    void isValid_nestedPartially() {
        String s = "({})({[]})";

        Assertions.assertTrue(test.isValid(s));
    }
}