import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] count = new int[2001];
        int[] rating = new int[n];

        for(int i=0; i<n; i++){
            rating[i] = sc.nextInt();
            count[rating[i]]++;
        }
        int highScore = 0;
        int[] rank = new int[2001];

        for(int score=2000; score>=1; score--){
            if(count[score] >= 0){
                rank[score] = 1+highScore;
            }
            highScore+=count[score];
        }
        for (int i = 0; i < n; i++) {
            int studentRating = rating[i];
            System.out.print(rank[studentRating] + " ");
        }
        System.out.println();

        sc.close();
    }
}
