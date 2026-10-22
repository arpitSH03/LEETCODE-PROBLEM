class Solution {
    public int minimumOperations(int[] nums) {
        int n = nums.length;
        int zero = -1;
        
        // Find the index of 0
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                zero = i;
                break;
            }
        }
        
        boolean rightIncreasing = true;
        boolean leftIncreasing = true;
        
        // Verify both directions around 0
        for (int i = 0; i < n; i++) {
            if (nums[(zero + i) % n] != i) {
                rightIncreasing = false;
            }
            if (nums[(zero - i + n) % n] != i) {
                leftIncreasing = false;
            }
        }
        
        int minOps = Integer.MAX_VALUE;
        
        if (rightIncreasing) {
            minOps = Math.min(minOps, zero);
            minOps = Math.min(minOps, n - zero + 2);
        }
        
        if (leftIncreasing) {
            minOps = Math.min(minOps, zero + 2);
            minOps = Math.min(minOps, n - zero);
        }
        
        return minOps == Integer.MAX_VALUE ? -1 : minOps;
    }
}
