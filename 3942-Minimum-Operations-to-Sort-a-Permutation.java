class Solution {
    public int minimumOperations(int[] nums) {
        int n = nums.length;
        int idx = -1;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                idx = i;
                break;
            }
        }
        
        boolean rightIncreasing = true;
        for (int i = 0; i < n; i++) {
            if (nums[(idx + i) % n] != i) {
                rightIncreasing = false;
                break;
            }
        }
        
        boolean leftIncreasing = true;
        for (int i = 0; i < n; i++) {
            if (nums[(idx - i + n) % n] != i) {
                leftIncreasing = false;
                break;
            }
        }
        
        int minOps = Integer.MAX_VALUE;
        
        if (rightIncreasing) {
            minOps = Math.min(minOps, idx);
            minOps = Math.min(minOps, n - idx + 2);
        }
        
        if (leftIncreasing) {
            minOps = Math.min(minOps, idx + 2);
            minOps = Math.min(minOps, n - idx);
        }
        
        return minOps == Integer.MAX_VALUE ? -1 : minOps;
    }
}

