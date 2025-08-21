public class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int current = nums[0];
        int max = nums[0];

        for (int i = 1; i < n; i++) {
            current = Math.max(nums[i], current + nums[i]);
            max = Math.max(max, current);
        }
        return max;
    }

    // For testing in VS Code
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int answer = sol.maxSubArray(nums);
        System.out.println("Maximum Subarray Sum: " + answer); // Expected output: 6
    }
}
