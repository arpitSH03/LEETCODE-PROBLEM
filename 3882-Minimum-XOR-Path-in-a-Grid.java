class Solution {
    // FIXED: Changed method name from minXORPath to minCost to match the LeetCode driver
    public int minCost(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length; // FIXED: Correctly gets the column length
        
        // Max cell value is 1023 (10 bits), so the max XOR will never exceed 1023
        int MAX_XOR = 1024; 
        
        // 2D table tracking columns and all possible XOR sums for the current/previous row
        boolean[][] prevRow = new boolean[n][MAX_XOR];
        
        // FIXED SYNTAX: Correctly set up the starting top-left cell coordinate (0, 0)
        prevRow[0][grid[0][0]] = true;
        
        // Fill out the first row (only moves from the left are possible)
        for (int j = 1; j < n; j++) {
            int currentVal = grid[0][j];
            for (int v = 0; v < MAX_XOR; v++) {
                if (prevRow[j - 1][v]) {
                    prevRow[j][v ^ currentVal] = true;
                }
            }
        }
        
        // Process the rest of the rows
        for (int i = 1; i < m; i++) {
            boolean[][] currRow = new boolean[n][MAX_XOR];
            
            for (int j = 0; j < n; j++) {
                int currentVal = grid[i][j];
                
                // 1. Move from the top neighbor (same column 'j' in prevRow)
                for (int v = 0; v < MAX_XOR; v++) {
                    if (prevRow[j][v]) {
                        currRow[j][v ^ currentVal] = true;
                    }
                }
                
                // 2. Move from the left neighbor (previous column 'j-1' in currRow)
                if (j > 0) {
                    for (int v = 0; v < MAX_XOR; v++) {
                        if (currRow[j - 1][v]) {
                            currRow[j][v ^ currentVal] = true;
                        }
                    }
                }
            }
            prevRow = currRow; // Shift rows forward
        }
        
        // Scan up from 0 to find the minimum valid XOR sum at the bottom-right cell
        for (int v = 0; v < MAX_XOR; v++) {
            if (prevRow[n - 1][v]) {
                return v;
            }
        }
        
        return -1;
    }
}
