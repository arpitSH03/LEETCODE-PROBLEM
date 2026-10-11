class Solution {
    
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        int arrayLength = nums.length;
        for (int startIndex = 0; startIndex < arrayLength; ) {
            int endIndex = startIndex;
          
          
            while (endIndex + 1 < arrayLength && nums[endIndex + 1] == nums[endIndex] + 1) {
                endIndex++;
            }
          
           
            result.add(formatRange(nums, startIndex, endIndex));
          
            
            startIndex = endIndex + 1;
        }
      
        return result;
    }
  
    private String formatRange(int[] nums, int startIndex, int endIndex) {
        // Check if range contains only one element
        if (startIndex == endIndex) {
            return String.valueOf(nums[startIndex]);
        }
        // Range contains multiple consecutive elements
        return String.format("%d->%d", nums[startIndex], nums[endIndex]);
    }
}
