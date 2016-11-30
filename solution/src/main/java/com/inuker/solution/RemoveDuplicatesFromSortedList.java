package com.inuker.solution;

/**
 * Created by dingjikerbo on 16/11/24.
 */

public class RemoveDuplicatesFromSortedList {

    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(0), cur = dummy;
        for ( ; head != null; head = head.next) {
            if (cur == dummy || head.val != cur.val) {
                cur.next = head;
                cur = cur.next;
            }
        }
        cur.next = null;
        return dummy.next;
    }
}