// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         // HashMap to store number value as key and its index as value
//         Map<Integer, Integer> numberToIndexMap = new HashMap<>();

//         // Iterate through the array
//         for (int i = 0; ; ++i) {
//             int currentNumber = nums[i];
//             int complement = target - currentNumber;

//             // Check if the complement exists in the map
//             if (numberToIndexMap.containsKey(complement)) {
//                 // Found the pair that sums to target
//                 // Return the indices: [index of complement, current index]
//                 return new int[] {numberToIndexMap.get(complement), i};
//             }

//             // Store current number and its index in the map for future lookups
//             numberToIndexMap.put(currentNumber, i);
//         }
//     }
// }
import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;

        // A pair requires two different indices.
        if (n < 2) {
            return new int[0];
        }

        /*
         * Check every pair once by keeping
         * the second index ahead of the first.
         */
        for (int first = 0; first < n - 1; first++) {
            for (int second = first + 1; second < n; second++) {
                long sum = (long) nums[first] + nums[second];

                // The current pair gives the required sum.
                if (sum == target) {
                    return new int[]{first, second};
                }
            }
        }

        // No valid pair exists.
        return new int[0];
    }
}

