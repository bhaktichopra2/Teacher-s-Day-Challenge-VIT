import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        boolean ruleApplies = true;
        for (int i = 1; i < word.length(); i++) {
            if (Character.isLowerCase(word.charAt(i))) {
                ruleApplies = false;
                break; 
            }
        }
        if (ruleApplies) {
            StringBuilder fixedWord = new StringBuilder();
            for (char c : word.toCharArray()) {
                if (Character.isUpperCase(c)) {
                    fixedWord.append(Character.toLowerCase(c));
                } else {
                    fixedWord.append(Character.toUpperCase(c));
                }
            }
            System.out.println(fixedWord.toString());
        } else {
            System.out.println(word);
        }
        sc.close();
    }
}

