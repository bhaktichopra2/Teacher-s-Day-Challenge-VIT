import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 0;

        for(int i = 0; i < n; i++){
            String s1 = sc.next();

            if(s1.charAt(1) == '+'){
                x += 1;
            }
            else if(s1.charAt(1) == '-'){
                x -= 1;
            }
        }
        System.out.println(x);
        sc.close();
    }
}