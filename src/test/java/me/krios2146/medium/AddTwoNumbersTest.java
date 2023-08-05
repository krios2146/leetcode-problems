package me.krios2146.medium;

import me.krios2146.utils.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class AddTwoNumbersTest {

    private final AddTwoNumbers test = new AddTwoNumbers();

    @Test
    void addTwoNumbers_shouldReturn708() {
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4, node3);
        ListNode firstNumber = new ListNode(2, node4);
        ListNode node4empty = new ListNode(4);
        ListNode node6 = new ListNode(6, node4empty);
        ListNode secondNumber = new ListNode(5, node6);
        ListNode node8 = new ListNode(8);
        ListNode node0 = new ListNode(0, node8);
        ListNode answer = new ListNode(7, node0);

        assertEquals(answer.toString(), test.addTwoNumbers(firstNumber, secondNumber).toString());
    }

    @Test
    void addTwoNumbers_shouldReturn0() {
        ListNode firstNumber = new ListNode(0);
        ListNode secondNumber = new ListNode(0);
        ListNode answer = new ListNode(0);

        assertEquals(answer.toString(), test.addTwoNumbers(firstNumber, secondNumber).toString());
    }

    @Test
    void addTwoNumbers_shouldReturn89990001() {
        ListNode node91 = new ListNode(9);
        ListNode node92 = new ListNode(9, node91);
        ListNode node93 = new ListNode(9, node92);
        ListNode firstNumber = new ListNode(9, node93);
        ListNode node94 = new ListNode(9, node93);
        ListNode node95 = new ListNode(9, node94);
        ListNode node96 = new ListNode(9, node95);
        ListNode secondNumber = new ListNode(9, node96);
        ListNode node1 = new ListNode(1);
        ListNode node01 = new ListNode(0, node1);
        ListNode node02 = new ListNode(0, node01);
        ListNode node03 = new ListNode(0, node02);
        ListNode node97 = new ListNode(9, node03);
        ListNode node98 = new ListNode(9, node97);
        ListNode node99 = new ListNode(9, node98);
        ListNode answer = new ListNode(8, node99);

        String actual = test.addTwoNumbers(firstNumber, secondNumber).toString();
        assertEquals(answer.toString(), actual);
    }
}