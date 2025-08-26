public class Solution {
    public String firstPalindrome(String[] words){
        for (String word : words) {
            if (isPali(word)) {
                return word;
            }
        }
        return "";
    }

    public boolean isPali(String s) {
        int l = 0;
        int r = s.length() - 1;

        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] words1 = {"abc", "car", "ada", "racecar", "cool"};
        String[] words2 = {"not", "a", "palindrome"};

        System.out.println("First palindromic string: " + solution.firstPalindrome(words1)); // Output: ada
        System.out.println("First palindromic string: " + solution.firstPalindrome(words2)); // Output: (empty string)
    }
}
