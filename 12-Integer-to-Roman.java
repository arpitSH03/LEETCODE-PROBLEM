class Solution {
    public String intToRoman(int num) {
        // Parallel arrays ordered from largest value to smallest value
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        
        StringBuilder roman = new StringBuilder();
        
        // Loop through each value-symbol pair
        for (int i = 0; i < values.length; i++) {
            // While the current number is greater than or equal to the value,
            // append the symbol and subtract the value from num
            while (num >= values[i]) {
                roman.append(symbols[i]);
                num -= values[i];
            }
        }
        
        return roman.toString();
    }
}