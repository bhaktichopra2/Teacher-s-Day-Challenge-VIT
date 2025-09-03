import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            String currentWord = words[i];
            if (currentWord.indexOf(x) != -1) {
                result.add(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] words = {"leet", "code", "apple", "banana"};
        char x = 'e';
        List<Integer> indices = sol.findWordsContaining(words, x);
        System.out.println(indices); // Output example: [0, 1]
    }
}
