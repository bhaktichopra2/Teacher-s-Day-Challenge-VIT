import java.util.*;

public class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int indexToMark = Math.abs(nums[i]) - 1;
            if (nums[indexToMark] > 0) {
                nums[indexToMark] = -nums[indexToMark];
            }
        }
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                result.add(i + 1);
            }
        }
        return result;
    }

    // Example usage
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> missing = sol.findDisappearedNumbers(nums);
        System.out.println("Disappeared numbers: " + missing); // Expected: [5, 6]
    }
}

