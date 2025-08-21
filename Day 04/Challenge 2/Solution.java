import java.util.Map;

public class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> map = Map.of(
            'I', 1, 'V', 5, 'X', 10, 'L', 50,
            'C', 100, 'D', 500, 'M', 1000
        );
        int n = s.length();
        int total = map.get(s.charAt(n - 1));
        for (int i = n - 2; i >= 0; i--) {
            int curr = map.get(s.charAt(i));
            int next = map.get(s.charAt(i + 1));
            if (curr < next) total -= curr;
            else total += curr;
        }
        return total;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        String roman1 = "IV";
        String roman2 = "XII";
        String roman3 = "MCMXCIV";

        System.out.println(roman1 + " -> " + sol.romanToInt(roman1));  // Output: 4
        System.out.println(roman2 + " -> " + sol.romanToInt(roman2));  // Output: 12
        System.out.println(roman3 + " -> " + sol.romanToInt(roman3));  // Output: 1994
    }
}
