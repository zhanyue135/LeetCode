package AddTwoNumbers;

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return combine(l1, l2, 0);
    }

    public ListNode combine(ListNode l1, ListNode l2, int carry) {
        if (l1 == null & l2 == null & carry == 0) {
            return null;
        }
        int sum = (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0) + carry;
        carry = sum > 9 ? 1 : 0;
        sum = sum > 9 ? sum - 10 : sum;

        ListNode node = new ListNode(sum);
        node.next = combine(l1 != null ? l1.next : null, l2 != null ? l2.next : null, carry);
        return node;
    }
}
