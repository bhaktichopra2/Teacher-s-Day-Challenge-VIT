public class Solution {
    public int countKeyChanges(String s) {
        String s_new = s.toLowerCase();
        int res = 0;
        for (int i = 0; i < s_new.length() - 1; i++) {
            if (s_new.charAt(i) != s_new.charAt(i + 1)) {
                res++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = "aAAbBB";
        System.out.println("Key changes: " + sol.countKeyChanges(s));
    }
}
