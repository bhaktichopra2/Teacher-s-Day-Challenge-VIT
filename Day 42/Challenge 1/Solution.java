public class Solution{
    public int theMaximumAchievableX(int num, int t) {
        return num + 2 * t;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int num = 5;
        int t = 3;
        int result = sol.theMaximumAchievableX(num, t);
        System.out.println("Maximum achievable X: " + result); // Output: 11
    }
}
