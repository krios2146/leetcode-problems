package me.krios2146.easy;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

public class NumberOfStudentsUnableToEatLunch {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> sandwichesQueue = new LinkedList<>();
        Queue<Integer> studentsQueue = new LinkedList<>();

        for (int sandwich : sandwiches) {
            sandwichesQueue.add(sandwich);
        }
        for (int student : students) {
            studentsQueue.add(student);
        }

        while (!sandwichesQueue.isEmpty()) {
            if (Objects.equals(studentsQueue.peek(), sandwichesQueue.peek())) {
                sandwichesQueue.poll();
                studentsQueue.poll();
            } else {
                Integer polled = studentsQueue.poll();
                studentsQueue.offer(polled);
            }
            if (!studentsQueue.contains(sandwichesQueue.peek())) {
                break;
            }
        }

        return studentsQueue.size();
    }
}
