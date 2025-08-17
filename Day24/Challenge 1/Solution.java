public class Solution {
    public int firstUniqChar(String s) {
        for(int i = 0; i < s.length(); i++) {
            boolean unique = true;
            for(int j = 0; j < s.length(); j++) {
                if(i != j && s.charAt(i) == s.charAt(j)) {
                    unique = false;
                    break;
                }
            }
            if(unique) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s1 = "leetcode";
        String s2 = "loveleetcode";
        String s3 = "aabb";

        System.out.println("Input: " + s1 + " Output: " + solution.firstUniqChar(s1)); // Output: 0
        System.out.println("Input: " + s2 + " Output: " + solution.firstUniqChar(s2)); // Output: 2
        System.out.println("Input: " + s3 + " Output: " + solution.firstUniqChar(s3)); // Output: -1
    }
}
