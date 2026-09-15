class Solution {
    public boolean check(int[] nums) {
        int breakCount = 0;
        int arrayLength = nums.length;
      
        // Iterate through all elements and compare with the next element (circular)
        for (int i = 0; i < arrayLength; i++) {
            // Use modulo to wrap around to index 0 when reaching the last element
            int nextIndex = (i + 1) % arrayLength;
          
            // Check if current element breaks the non-decreasing order
            if (nums[i] > nums[nextIndex]) {
                breakCount++;
            }
        }
      
        // Valid rotation has at most 1 break point
        return breakCount <= 1;
        
    }
}