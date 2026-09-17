class Solution {
    public int addDigits(int num) {
        // Handle edge case explicitly for clarity
        if (num == 0) {
            return 0;
        }
        return (num - 1) % 9 + 1;
        
    }
}