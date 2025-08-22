import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int prev = 0;
        int count = 0;

        for(int i=0; i<n; i++){
            int num = sc.nextInt();
            if(prev == 0){
                prev=num;
                continue;
            }
            if(prev != num){
                count++;
            }
            prev=num;
        }
        System.out.println(count+1);
        sc.close();
    }
}
