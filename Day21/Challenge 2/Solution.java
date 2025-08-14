import java.util.Scanner;

public class Solution {

    public int differenceOfSums(int n, int m) {
        int num1 = 0; // sum of numbers not divisible by m
        int num2 = 0; // sum of numbers divisible by m

        for (int i = 1; i <= n; i++) {
            if (i % m != 0) {  // FIX: not divisible goes to num1
                num1 += i;
            } else {           // divisible goes to num2
                num2 += i;
            }
        }
        return num1 - num2; // difference
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter n (range limit): ");
        int n = sc.nextInt();
        System.out.print("Enter m (divisor): ");
        int m = sc.nextInt();
        sc.close();

        // Call method
        Solution sol = new Solution();
        int result = sol.differenceOfSums(n, m);

        // Output
        System.out.println("Difference of sums: " + result);
    }
}
