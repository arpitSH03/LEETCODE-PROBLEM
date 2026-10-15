class Solution {
    // Sorts nums containing only 0, 1, and 2.
    public void sortColors(int[] nums) {
        int zeroCount = 0;
        int oneCount = 0;
        int twoCount = 0;
 
        // Count how many times each allowed value appears.
        for (int value : nums) {
            // Increase the counter that matches the current value.
            if (value == 0) {
                zeroCount++;
            } else if (value == 1) {
                oneCount++;
            } else {
                twoCount++;
            }
        }
 
        int index = 0;
 
        // Write all zeroes first.
        for (int count = 0; count < zeroCount; count++) {
            nums[index] = 0;
            index++;
        }
 
        // Write all ones after the zeroes.
        for (int count = 0; count < oneCount; count++) {
            nums[index] = 1;
            index++;
        }
 
        // Write all twos at the end.
        for (int count = 0; count < twoCount; count++) {
            nums[index] = 2;
            index++;
        }
    }
}
    