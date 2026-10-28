class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) {
            return null;
        }

        int length = 0;
        ListNode currentNode = head;

        while (currentNode != null) {
            length++;
            currentNode = currentNode.next;
        }
        if (length == n) {
            ListNode newHead = head.next;
            head = null;
            return newHead;
        }
      
        int positionToStop = length - n;
        currentNode = head;
        int count = 1;
        while (count < positionToStop) {
            currentNode = currentNode.next;
            count++;
        }
        currentNode.next = currentNode.next.next;
        return head;
    }
}