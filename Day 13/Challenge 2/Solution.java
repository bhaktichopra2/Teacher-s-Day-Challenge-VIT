import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();

        String first = word.substring(0,1);
        String rest = word.substring(1);

        String res = first.toUpperCase() + rest;
        System.out.println(res);
        sc.close();
    }
}
