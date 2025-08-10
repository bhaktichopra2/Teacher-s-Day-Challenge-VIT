public class Solution {

    // Method to calculate the minimum time to visit all points
    public int minTimeToVisitAllPoints(int[][] points) {
        int time = 0;

        for (int i = 0; i < points.length - 1; i++) {
            int[] current = points[i];
            int[] next = points[i + 1];

            int x = Math.abs(next[0] - current[0]);
            int y = Math.abs(next[1] - current[1]);

            // Time is the maximum difference in either x or y direction
            time += Math.max(x, y);
        }
        return time;
    }

    // Main method for testing in VS Code
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Sample test case
        int[][] points = {
            {1, 1},
            {3, 4},
            {-1, 0}
        };

        int result = sol.minTimeToVisitAllPoints(points);
        System.out.println("Minimum time to visit all points: " + result); // Expected: 7
    }
}

