class Solution {
    public List<String> letterCombinations(String digits) {
        // Initialize result list to store all possible combinations
        List<String> result = new ArrayList<>();
      
        // Handle edge case: empty input
        if (digits.length() == 0) {
            return result;
        }
      
        // Start with an empty string to build upon
        result.add("");
    
        String[] digitToLetters = new String[] {
            "abc",  // 2
            "def",  // 3
            "ghi",  // 4
            "jkl",  // 5
            "mno",  // 6
            "pqrs", // 7
            "tuv",  // 8
            "wxyz"  // 9
        };
      
        // Process each digit in the input string
        for (char digit : digits.toCharArray()) {
            // Get the letters corresponding to current digit
            // Subtract '2' because our array starts at digit 2
            String letters = digitToLetters[digit - '2'];
          
            // Temporary list to store new combinations for current digit
            List<String> tempCombinations = new ArrayList<>();
          
            // For each existing combination in result
            for (String existingCombination : result) {
                // Append each letter of current digit to existing combinations
                for (char letter : letters.toCharArray()) {
                    tempCombinations.add(existingCombination + letter);
                }
            }
          
            // Update result with new combinations
            result = tempCombinations;
        }
      
        return result;
    }
}
