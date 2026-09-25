class Solution {
public:
    vector<int> findDisappearedNumbers(vector<int>& nums) {
        int n = nums.size();
      
        // Create a boolean array to track which numbers appear in the input
        // Index represents the number (1 to n), value indicates presence
        vector<bool> seen(n + 1, false);
      
        // Mark all numbers that appear in the input array
        for (int num : nums) {
            seen[num] = true;
        }
      
        // Collect all numbers from 1 to n that were not seen
        vector<int> result;
        for (int i = 1; i <= n; ++i) {
            if (!seen[i]) {
                result.push_back(i);
            }
        }
      
        return result;
    }
};
