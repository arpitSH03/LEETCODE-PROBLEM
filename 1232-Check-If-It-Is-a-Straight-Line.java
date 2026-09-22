class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        int x1 = coordinates[0][0];
        int y1 = coordinates[0][1];
        int x2 = coordinates[1][0];
        int y2 = coordinates[1][1];
        for (int i = 2; i < coordinates.length; i++) {
            int currentX = coordinates[i][0];
            int currentY = coordinates[i][1];
          
            // Calculate the cross products
            int leftSide = (currentX - x1) * (y2 - y1);
            int rightSide = (currentY - y1) * (x2 - x1);
            if (leftSide != rightSide) {
                return false;
            }
        }
        return true;
    }
}
