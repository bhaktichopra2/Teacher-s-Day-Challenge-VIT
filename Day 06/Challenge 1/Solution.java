public class Solution {
    public int numIdenticalPairs(int[] nums) {
        int good = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] == nums[j]) {
                    good++;
                }
            }
        }
        return good;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] nums1 = {1, 2, 3, 1, 1, 3};
        System.out.println("Input: [1, 2, 3, 1, 1, 3]");
        System.out.println("Good pairs: " + sol.numIdenticalPairs(nums1));  // Output: 4

        int[] nums2 = {1, 1, 1, 1};
        System.out.println("Input: [1, 1, 1, 1]");
        System.out.println("Good pairs: " + sol.numIdenticalPairs(nums2));  // Output: 6

        int[] nums3 = {1, 2, 3};
        System.out.println("Input: [1, 2, 3]");
        System.out.println("Good pairs: " + sol.numIdenticalPairs(nums3));  // Output: 0
    }
}
