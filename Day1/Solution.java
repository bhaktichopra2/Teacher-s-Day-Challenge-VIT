public class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        
        for (int num : nums) {
            if (Integer.toString(num).length() % 2 == 0) {
                count++;
            }
        }
        
        return count;
    }
    
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        int[] nums = {12, 345, 2, 6, 7896};
        
        int result = solution.findNumbers(nums);
        System.out.println("Count of numbers with even digits: " + result);  // Expected output: 2
    }
}
