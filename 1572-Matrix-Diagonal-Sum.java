class Solution {
    public int diagonalSum(int[][] arr) { 
        int sum = 0;
        int matrixSize = arr.length;
        for (int row = 0; row < matrixSize; ++row) {
            int Col = matrixSize - row - 1;
            sum += arr[row][row];  
            if (row != Col) {
                sum += arr[row][Col]; 
            }
        }
      
        return sum;
    }
}

        
        