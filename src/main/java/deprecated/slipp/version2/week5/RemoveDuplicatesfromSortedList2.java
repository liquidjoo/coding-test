package deprecated.slipp.version2.week5;

import java.util.*;

public class RemoveDuplicatesfromSortedList2 {

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static void main(String... args) {

    }

    public class Solution {
        public ListNode deleteDuplicates(ListNode head) {

            Map<Integer, Integer> map = new TreeMap<>();

            ListNode current = head;
            while (Objects.nonNull(current)) {
                map.put(current.val, map.getOrDefault(current.val, 1) + 1);
                current = current.next;
            }

            ListNode result = new ListNode(0);
            ListNode tail = result;

            for (final Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getValue() == 1) {
                    tail.next = new ListNode(entry.getKey());
                    tail = tail.next;
                }
            }

            return result.next;
        }
    }
}
