public class Solution {
    public int sumOfMultiples(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 10;
        int result = sol.sumOfMultiples(n);
        System.out.println("Sum of multiples of 3, 5, or 7 (from 0 to " + n + "): " + result);
        // Output: 40
    }
}
