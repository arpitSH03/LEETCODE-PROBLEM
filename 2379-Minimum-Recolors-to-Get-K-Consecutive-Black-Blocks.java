class Solution {
    public int minimumRecolors(String blocks, int k) {
        // Count the number of white blocks in the first window of size k
        int whiteCount = 0;
        for (int i = 0; i < k; i++) {
            if (blocks.charAt(i) == 'W') {
                whiteCount++;
            }
        }
      
        // Initialize the minimum recolors needed with the first window's white count
        int minRecolors = whiteCount;
      
        // Use sliding window technique to check all windows of size k
        for (int i = k; i < blocks.length(); i++) {
            // Add the new element entering the window
            if (blocks.charAt(i) == 'W') {
                whiteCount++;
            }
          
            // Remove the element leaving the window
            if (blocks.charAt(i - k) == 'W') {
                whiteCount--;
            }
          
            // Update the minimum recolors needed
            minRecolors = Math.min(minRecolors, whiteCount);
        }
      
        return minRecolors;
    }
}
