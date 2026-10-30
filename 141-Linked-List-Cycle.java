
public class Solution {
    public boolean hasCycle(ListNode head) {
        Set<ListNode> visitedNodes = new HashSet<>();
        ListNode currentNode = head;
        while (currentNode != null) {
            if (!visitedNodes.add(currentNode)) {
                return true;
            }
            currentNode = currentNode.next;
        }
        return false;
    }
}
