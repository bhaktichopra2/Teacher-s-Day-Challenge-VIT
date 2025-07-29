import java.util.*;

public class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');

        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (map.containsKey(ch)) {
                char top = stack.isEmpty() ? '#' : stack.pop();
                if (top != map.get(ch)) return false;
            } else {
                stack.push(ch);
            }
        }
        return stack.isEmpty();
    }

    // Optional main method to test the solution
    public static void main(String[] args) {
        Solution sol = new Solution();

        String test1 = "()";
        String test2 = "()[]{}";
        String test3 = "(]";
        String test4 = "([)]";
        String test5 = "{[]}";

        System.out.println(test1 + " is valid? " + sol.isValid(test1)); // true
        System.out.println(test2 + " is valid? " + sol.isValid(test2)); // true
        System.out.println(test3 + " is valid? " + sol.isValid(test3)); // false
        System.out.println(test4 + " is valid? " + sol.isValid(test4)); // false
        System.out.println(test5 + " is valid? " + sol.isValid(test5)); // true
    }
}
