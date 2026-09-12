
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
         ListNode current = head;
      
        // Traverse the list until we reach the end
        while (current != null && current.next != null) {
            // Check if current node's value equals the next node's value
            if (current.val == current.next.val) {
                // Skip the duplicate node by updating the pointer
                // This effectively removes the duplicate from the list
                current.next = current.next.next;
            } else {
                // No duplicate found, move to the next node
                current = current.next;
            }
        }
        return head;
    }    
}    
        
    
