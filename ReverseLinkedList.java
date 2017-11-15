/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */
class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }
        Stack<ListNode> stack = new Stack<>();
        while (head != null) {
            stack.push(head);
            head = head.next;
        }
        ListNode tempNode = stack.pop();
        ListNode resultNode = tempNode;
        while (!stack.isEmpty()) {
            tempNode.next = stack.pop();
            tempNode = tempNode.next;
        }
        tempNode.next = null;
        return resultNode;
    }
}