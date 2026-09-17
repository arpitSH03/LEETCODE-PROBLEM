class Solution {
public:
    vector<string> fizzBuzz(int n) {
        // Initialize result vector to store output strings
        vector<string> result;
      
        // Iterate through numbers from 1 to n inclusive
        for (int i = 1; i <= n; ++i) {
            // Initialize current string for this number
            string currentString = "";
          
            // Check if number is divisible by 3
            if (i % 3 == 0) {
                currentString += "Fizz";
            }
          
            // Check if number is divisible by 5
            if (i % 5 == 0) {
                currentString += "Buzz";
            }
          
            // If not divisible by 3 or 5, use the number itself
            if (currentString.empty()) {
                currentString = to_string(i);
            }
          
            // Add the resulting string to the result vector
            result.push_back(currentString);
        }
      
        // Return the complete result vector
        return result;
    }
};
