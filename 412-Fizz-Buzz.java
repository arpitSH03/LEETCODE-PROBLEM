class Solution {
    public List<String> fizzBuzz(int n) {
         List<String> result = new ArrayList<>();
      
        // Iterate through numbers from 1 to n (inclusive)
        for (int currentNumber = 1; currentNumber <= n; currentNumber++) {
            // Build the string representation for the current number
            String currentString = "";
          
            // Check if divisible by 3
            if (currentNumber % 3 == 0) {
                currentString += "Fizz";
            }
          
            // Check if divisible by 5
            if (currentNumber % 5 == 0) {
                currentString += "Buzz";
            }
          
            // If not divisible by 3 or 5, use the number itself
            if (currentString.length() == 0) {
                currentString += currentNumber;
            }
          
            // Add the processed string to the result list
            result.add(currentString);
        }
      
        return result;

        
    }
}