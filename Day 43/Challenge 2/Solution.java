public class Solution {
    public int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;

        while(n > 0){
            int digit = n % 10;
            product *= digit;
            sum += digit;
            n /= 10;
        }
        return product - sum;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int input = 234;
        int result = sol.subtractProductAndSum(input);
        System.out.println("Result: " + result);  // Expected output: 15
    }
}
