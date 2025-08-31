public class Solution {
    public int xorOperation(int n, int start) {
        int result = 0;
        for (int i = 0; i < n; i++) {
            int num = start + 2 * i;
            result ^= num;
        }
        return result;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 5;
        int start = 0;
        System.out.println("XOR Operation result: " + sol.xorOperation(n, start));
    }
}
