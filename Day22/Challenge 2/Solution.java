import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int res = (n+4)/5;
        System.out.println(res);
        sc.close();
    }
}
