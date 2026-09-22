class Solution {
public:
    bool checkStraightLine(vector<vector<int>>& coordinates) {
        // Get the first two points to establish the reference line
        int x1 = coordinates[0][0];
        int y1 = coordinates[0][1];
        int x2 = coordinates[1][0];
        int y2 = coordinates[1][1];
      
        // Check if all remaining points are collinear with the first two points
        // Using cross product formula: (x - x1) * (y2 - y1) == (y - y1) * (x2 - x1)
        // This avoids division by zero issues when dealing with vertical lines
        for (int i = 2; i < coordinates.size(); ++i) {
            int currentX = coordinates[i][0];
            int currentY = coordinates[i][1];
          
            // Cross product should be zero for collinear points
            // If not equal, points are not on the same straight line
            if ((currentX - x1) * (y2 - y1) != (currentY - y1) * (x2 - x1)) {
                return false;
            }
        }
      
        // All points are collinear
        return true;
    }
};
