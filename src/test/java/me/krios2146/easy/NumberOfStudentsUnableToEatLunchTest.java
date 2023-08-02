package me.krios2146.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumberOfStudentsUnableToEatLunchTest {

    private final NumberOfStudentsUnableToEatLunch unableToEatLunch = new NumberOfStudentsUnableToEatLunch();

    @Test
    void countStudents_shouldReturn0() {
        int[] students = new int[]{1, 1, 0, 0};
        int[] sandwiches = new int[]{0, 1, 0, 1};

        int studentsUnableToEat = unableToEatLunch.countStudents(students, sandwiches);

        assertEquals(0, studentsUnableToEat);
    }

    @Test
    void countStudents_shouldReturn3() {
        int[] students = new int[]{1, 1, 1, 0, 0, 1};
        int[] sandwiches = new int[]{1, 0, 0, 0, 1, 1};

        int studentsUnableToEat = unableToEatLunch.countStudents(students, sandwiches);

        assertEquals(3, studentsUnableToEat);
    }

}