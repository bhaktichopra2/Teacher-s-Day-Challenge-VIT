import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long k = sc.nextLong();
        Long n = sc.nextLong();
        Long w = sc.nextLong();
        long price = k * (w * (w + 1) / 2);

        Long borrow = price - n;
        System.out.println(borrow);
        sc.close();
    }
}
