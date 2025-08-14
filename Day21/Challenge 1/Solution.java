import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] givers = new int[n];

        for(int i=0; i<n; i++){
            int giver = i+1;
            int receiver = sc.nextInt();

            givers[receiver-1]=giver;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(givers[i] + " ");
        }
        sc.close();
    }
}
