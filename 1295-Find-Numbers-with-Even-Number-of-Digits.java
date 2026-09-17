class Solution {
    public int findNumbers(int[] nums) {
            // Initialize counter for numbers with even digit count
        int evenDigitCount = 0;
      
        // Iterate through each number in the array
        for (int number : nums) {
            // Convert number to string and check if digit count is even
            if (String.valueOf(number).length() % 2 == 0) {
                // Increment counter if number has even number of digits
                evenDigitCount++;
            }
        }
        return evenDigitCount;
        
    }
}