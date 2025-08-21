import java.util.HashSet;
import java.util.Set;

public class Solution {

    public boolean checkIfPangram(String sentence) {
        Set<Character> seen = new HashSet<>();
        for (char current : sentence.toCharArray()) {
            seen.add(current);
        }
        return seen.size() == 26;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        String test1 = "thequickbrownfoxjumpsoverthelazydog";
        String test2 = "leetcode";

        System.out.println("Test 1: " + solution.checkIfPangram(test1)); // true
        System.out.println("Test 2: " + solution.checkIfPangram(test2)); // false
    }
}
