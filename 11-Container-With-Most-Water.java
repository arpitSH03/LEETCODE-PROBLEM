class Solution {
    public int maxArea(int[] height) {
        /
        int leftPointer = 0;
        int rightPointer = height.length - 1;
      
        int maxAreaFound = 0;
      
        // Continue until the two pointers meet
        while (leftPointer < rightPointer) {
            // Calculate current area: minimum height * width between pointers
            int currentHeight = Math.min(height[leftPointer], height[rightPointer]);
            int currentWidth = rightPointer - leftPointer;
            int currentArea = currentHeight * currentWidth;
          
            // Update maximum area if current area is larger
            maxAreaFound = Math.max(maxAreaFound, currentArea);
          
            if (height[leftPointer] < height[rightPointer]) {
                leftPointer++;
            } else {
                rightPointer--;
            }
        }
      
        return maxAreaFound;
    }
}
