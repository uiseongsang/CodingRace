class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;

        while (current != null && current.next != null) {
            if (current.val == current.next.val) {
                // 중복된 노드를 건너뜀
                current.next = current.next.next;
            } else {
                // 다음 노드로 이동
                current = current.next;
            }
        }

        return head;
    }
}
