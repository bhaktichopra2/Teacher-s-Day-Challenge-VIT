/*1st Attempt: Brute-force
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        for(int i = 0; i<n; i++){
            int count = 0;
            for(int j = 0; j<n; j++){
                if(nums[j]<nums[i]){
                    count++;
                }
            }
            result[i] = count;
        }
        return result;
    }
}
 */
import java.util.*;

public class Solution {

    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int[] sorted = Arrays.copyOf(nums, n);

        Arrays.sort(sorted);

        Map<Integer, Integer> count = new HashMap<>();

        for (int i = 0; i < n; i++) {
            count.putIfAbsent(sorted[i], i);
        }

        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            res[i] = count.get(nums[i]);
        }
        return res;
    }

    // Test the method in main
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {8, 1, 2, 2, 3};
        int[] ans = sol.smallerNumbersThanCurrent(nums);

        System.out.println("Input: " + Arrays.toString(nums));
        System.out.println("Output: " + Arrays.toString(ans)); // Expected: [4, 0, 1, 1, 3]
    }
}
