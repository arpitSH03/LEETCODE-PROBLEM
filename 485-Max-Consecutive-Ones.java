class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
           int maxConsecutiveOnes = 0;
      
        // Variable to track the current consecutive ones count
        int currentConsecutiveCount = 0;
      
        // Iterate through each element in the array
        for (int num : nums) {
            if (num == 1) {
                // If current element is 1, increment the consecutive count
                currentConsecutiveCount++;
                // Update the maximum if current consecutive count is larger
                maxConsecutiveOnes = Math.max(maxConsecutiveOnes, currentConsecutiveCount);
            } else {
               
                currentConsecutiveCount = 0;
            }
        }
      
        return maxConsecutiveOnes;
    }
}