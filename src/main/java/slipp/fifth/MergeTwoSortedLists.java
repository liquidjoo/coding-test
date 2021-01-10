package slipp.fifth;

import java.util.Objects;

public class MergeTwoSortedLists {

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

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        

        ListNode listNode;

        if (Objects.isNull(l1) && Objects.isNull(l2)) {
            return null;
        }

        if (l1.val > l2.val) {
            listNode = new ListNode(l2.val);
            l2 = l2.next;
        } else {
            listNode = new ListNode(l1.val);
            l1 = l1.next;
        }
        ListNode first = listNode;

        while (Objects.nonNull(l1.next) || Objects.nonNull(l2.next)) {
            if (l1.val < l2.val) {
                listNode.next = new ListNode(l1.val);
                l1 = l1.next;
            } else {
                listNode.next = new ListNode(l2.val);
                l2 = l2.next;
            }
            listNode = listNode.next;
        }

        if (l1.val > l2.val) {
            listNode.next = new ListNode(l2.val);
            listNode = listNode.next;
            listNode.next = new ListNode(l1.val);
        } else {
            listNode.next = new ListNode(l1.val);
            listNode = listNode.next;
            listNode.next = new ListNode(l2.val);
        }

        return first;
    }

    public void test() {

        ListNode listNode = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode listNode2 = new ListNode(1, new ListNode(3, new ListNode(4)));

        mergeTwoLists(listNode, listNode2);
    }

}
