public class Solution {
    public int countDigits(int num) {
        int count = 0;
        int original = num;
        String s = String.valueOf(num);
        for (char c : s.toCharArray()) {
            int digit = Character.getNumericValue(c);
            if (digit != 0 && original % digit == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int test1 = 7;
        int test2 = 121;
        int test3 = 1248;

        System.out.println("Input: 7   Output: " + solution.countDigits(test1));      // Output: 1
        System.out.println("Input: 121 Output: " + solution.countDigits(test2));     // Output: 2
        System.out.println("Input: 1248 Output: " + solution.countDigits(test3));    // Output: 4
    }
}
