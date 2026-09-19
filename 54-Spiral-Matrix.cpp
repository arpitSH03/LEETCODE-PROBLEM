class Solution {
public:
    vector<int> spiralOrder(vector<vector<int>>& matrix) {
        int rows = matrix.size();
        int cols = matrix[0].size();
      
        // Direction vectors: right, down, left, up
        // dirs[i] and dirs[i+1] represent row and column increments respectively
        int directions[5] = {0, 1, 0, -1, 0};
      
        // Current position and direction index
        int currentRow = 0;
        int currentCol = 0;
        int directionIndex = 0;
      
        // Result vector to store spiral order elements
        vector<int> result;
      
        // Visited matrix to track already visited cells
        bool visited[rows][cols];
        memset(visited, false, sizeof(visited));
      
        // Traverse all elements in the matrix
        for (int count = rows * cols; count > 0; --count) {
            // Add current element to result
            result.push_back(matrix[currentRow][currentCol]);
          
            // Mark current cell as visited
            visited[currentRow][currentCol] = true;
          
            // Calculate next position based on current direction
            int nextRow = currentRow + directions[directionIndex];
            int nextCol = currentCol + directions[directionIndex + 1];
          
            // Check if we need to change direction:
            // - If next position is out of bounds
            // - If next position is already visited
            if (nextRow < 0 || nextRow >= rows || 
                nextCol < 0 || nextCol >= cols || 
                visited[nextRow][nextCol]) {
                // Change direction clockwise (right -> down -> left -> up -> right)
                directionIndex = (directionIndex + 1) % 4;
            }
          
            // Move to next position using current (possibly updated) direction
            currentRow += directions[directionIndex];
            currentCol += directions[directionIndex + 1];
        }
      
        return result;
    }
};
