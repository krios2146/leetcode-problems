package me.krios2146.medium;

import me.krios2146.utils.ListNode;

import java.util.HashMap;
import java.util.Map;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Map<Integer, Integer> firstNumberDigitsOrder = getOrderOfDigitsFromList(l1);
        Map<Integer, Integer> secondNumberDigitsOrder = getOrderOfDigitsFromList(l2);

        Map<Integer, ListNode> orderOfNodes = new HashMap<>();

        boolean isRemainderLeft = false;
        int indexOfNode = 0;
        while (firstNumberDigitsOrder.get(indexOfNode) != null && secondNumberDigitsOrder.get(indexOfNode) != null || isRemainderLeft) {
            Integer lastDigitOfFirstNumber = firstNumberDigitsOrder.getOrDefault(indexOfNode, 0);
            Integer lastDigitOfSecondNumber = secondNumberDigitsOrder.getOrDefault(indexOfNode, 0);

            int sum = lastDigitOfFirstNumber + lastDigitOfSecondNumber;

            if (isRemainderLeft) {
                sum += 1;
            }

            if (sum >= 10) {
                isRemainderLeft = true;
                sum = sum % 10;
            } else {
                isRemainderLeft = false;
            }

            orderOfNodes.put(indexOfNode, new ListNode(sum));

            indexOfNode++;
        }

        ListNode sumList = null;

        for (int i = 0; i < orderOfNodes.size(); i++) {
            ListNode node = orderOfNodes.get(i);

            node.next = orderOfNodes.get(i + 1);

            if (sumList == null) {
                sumList = node;
            }
        }

        return sumList == null ? new ListNode(0) : sumList;
    }

    private static Map<Integer, Integer> getOrderOfDigitsFromList(ListNode list) {
        Map<Integer, Integer> digitsOrder = new HashMap<>();

        int counter = 0;
        while (list != null) {
            digitsOrder.put(counter, list.val);
            list = list.next;
            counter++;
        }

        return digitsOrder;
    }
}
