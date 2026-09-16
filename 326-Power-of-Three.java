class Solution {
    public boolean isPowerOfThree(int n) {
           while (n > 2) {
            // If n is not divisible by 3, it cannot be a power of three
            if (n % 3 != 0) {
                return false;
            }
            // Divide n by 3 to check the next level
            n /= 3;
        }
      
        // After all divisions, n should be 1 if it was a power of three
        // (since 3^0 = 1)
        return n == 1;
        
    }
}