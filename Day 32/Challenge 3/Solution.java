
import java.util.Scanner;

public class Solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47};

        int nIndex = -1;
        for (int i = 0; i < primes.length; i++) {
            if (primes[i] == n) {
                nIndex = i;
                break;
            }
        }

        if (nIndex != -1 && nIndex + 1 < primes.length && primes[nIndex + 1] == m) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        sc.close();
    }
}