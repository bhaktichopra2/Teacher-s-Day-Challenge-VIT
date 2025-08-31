import java.util.Scanner;
public class Solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();
        
        long oddCount = (n + 1) / 2;
        
        long result;
        if (k <= oddCount) {
            result = 2 * k - 1;  // kth odd number
        } else {
            long evenIndex = k - oddCount;
            result = 2 * evenIndex;  // kth even number
        }
        System.out.println(result);
        sc.close();
    }
}

