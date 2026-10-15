class Solution {
    // Returns the majority element.
    public int majorityElement(int[] nums) {
        int threshold = nums.length / 2;
 
        // Test every array value as a possible majority candidate.
        for (int candidate : nums) {
            int frequency = 0;
 
            // Count the candidate across the complete array.
            for (int value : nums) {
                // Equal values contribute to the candidate's frequency.
                if (value == candidate) {
                    frequency++;
                }
            }
 
            // A strict majority appears more than half of the time.
            if (frequency > threshold) {
                return candidate;
            }
        }
 
        return -1;
    }
}