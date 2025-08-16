public class Solution {
    public String toLowerCase(String s) {
        return s.toLowerCase();
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        String[] testInputs = {"Hello", "here", "LOVELY"};
        for (String input : testInputs) {
            String output = sol.toLowerCase(input);
            System.out.println("Input: " + input + " -> Output: " + output);
        }
    }
}
