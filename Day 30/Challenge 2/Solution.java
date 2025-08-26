import java.util.Scanner;

public class Solution{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char current = 'a';
        int totalrot = 0;

        for(char ch : s.toCharArray()){
            int diff = Math.abs(current - ch);
            int rot = Math.min(diff, 26-diff);
            totalrot += rot;
            current = ch;
        }
        System.out.println(totalrot);
        sc.close();
    }
}