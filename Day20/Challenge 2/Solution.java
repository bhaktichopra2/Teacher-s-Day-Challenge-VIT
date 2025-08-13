import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        String a = s.replaceAll("(WUB)+", " ");
        String f = a.trim();
        System.out.println(f);
        sc.close();
    }
}
