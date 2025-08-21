import java.util.Arrays;

public class Solution {
    public int[] numberGame(int[] nums) {
        // Step 1: Sort the array
        Arrays.sort(nums);

        // Step 2: Swap adjacent elements
        for (int i = 0; i < nums.length; i += 2) {
            int temp = nums[i];
            nums[i] = nums[i + 1];
            nums[i + 1] = temp;
        }

        // Step 3: Return the modified array
        return nums;
    }

    // Main method to test the function
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] input = {5, 4, 2, 3};
        int[] result = solution.numberGame(input);

        System.out.print("Output: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
