package Day28.Challenge;
class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        for (String sentence : sentences) {
            String[] words = sentence.split(" ");
            int current = words.length;
            if (current > max) {
                max = current;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] sentences = {
            "alice and bob love leetcode",
            "i think so too",
            "this is great thanks very much"
        };
        int result = solution.mostWordsFound(sentences);
        System.out.println("Maximum number of words in any sentence: " + result);
    }
}
