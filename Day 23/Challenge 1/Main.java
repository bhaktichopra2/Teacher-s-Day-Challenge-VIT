public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        int num1 = 38;
        int num2 = 0;
        int num3 = 99;

        System.out.println("Input: " + num1 + " -> Output: " + solution.addDigits(num1));
        System.out.println("Input: " + num2 + " -> Output: " + solution.addDigits(num2));
        System.out.println("Input: " + num3 + " -> Output: " + solution.addDigits(num3));
    }
}

class Solution {
    public int addDigits(int num) {
        if (num == 0) {
            return 0;
        }
        
        if (num % 9 == 0) {
            return 9;
        }
        
        return num % 9;
    }
}
