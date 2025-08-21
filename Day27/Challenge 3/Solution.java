import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] card = new int[n];
        for(int i=0; i<n; i++){
            card[i] =sc.nextInt();
        }
        int l=0;
        int r=n-1;
        boolean turn = true;
        int s_max = 0;
        int d_max = 0;
        while(l<=r){
            int chosen;
            if(card[l]>card[r]){
                chosen = card[l];
                l++;
            }else{
                chosen = card[r];
                r--;
            }
            if(turn){
                s_max += chosen;
            }else{
                d_max += chosen;
            }

            turn = !turn;
        }
        System.out.println(s_max +" "+ d_max);
        sc.close();
    }
}