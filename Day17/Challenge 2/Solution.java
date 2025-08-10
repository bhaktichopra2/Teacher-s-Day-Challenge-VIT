import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        int l = 0;
        int u = 0;

        for(int i = 0; i < n; i++){
            char ch = s.charAt(i);
            if(Character.isLowerCase(ch)){
                l++;
            }else{
                u++;
            }
        } 

        if(l>=u){
                System.out.println(s.toLowerCase());
            }
            else if(l<u){
                System.out.println(s.toUpperCase());
            }
        sc.close();
    }
}