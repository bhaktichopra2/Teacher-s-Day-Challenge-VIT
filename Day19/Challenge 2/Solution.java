import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        int n = s.length();

        if(n==t.length()){
            boolean isRev = true;
            for(int i=0; i<n ;i++){
                if(s.charAt(i) != t.charAt(n-1-i)){
                    isRev = false;
                    break;
                }
            }
            if(isRev){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        else{
            System.out.println("NO");
        }
        sc.close();
    }
}
