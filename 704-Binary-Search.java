class Solution {
    public int search(int[] nums, int target) {
         int left = 0;
        int right = nums.length - 1;
        int firstTrueIndex = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] >= target) {
                firstTrueIndex = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        if (firstTrueIndex != -1 && nums[firstTrueIndex] == target) {
            return firstTrueIndex;
        }
        return -1;
        
    }
}