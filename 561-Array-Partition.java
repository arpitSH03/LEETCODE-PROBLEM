class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
      
        // Initialize the sum to store the result
        int sum = 0;
      
        // Iterate through the sorted array, taking every other element (at even indices)
        // Since the array is sorted, nums[i] will always be the minimum in the pair (nums[i], nums[i+1])
        for (int i = 0; i < nums.length; i += 2) {
            sum += nums[i];
        }
      
        return sum;
    }
}