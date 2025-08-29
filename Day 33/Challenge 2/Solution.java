public class Solution{
    public int differenceOfSum(int[] nums) {
        int elesum = 0;
        int digisum = 0;

        for (int num : nums) {
            elesum += num;
            int temp = num;
            while (temp > 0) {
                digisum += temp % 10;
                temp /= 10;
            }
        }

        int diff = Math.abs(elesum - digisum);
        return diff;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {1, 15, 6, 3};
        int result = sol.differenceOfSum(nums);
        System.out.println("Absolute difference: " + result); // Output: 9
    }
}
