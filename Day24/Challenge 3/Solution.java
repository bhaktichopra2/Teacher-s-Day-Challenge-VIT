import java.util.Scanner;

public class Solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] heights = new int[n];

        for (int i = 0; i < n; i++) {
            heights[i] = sc.nextInt();
        }

        int maxWatered = 0;
        for (int i = 0; i < n; i++) {
            int currentWatered = 1;

            for (int j = i - 1; j >= 0; j--) {
                if (heights[j] <= heights[j + 1]) {
                    currentWatered++;
                } else {
                    break; 
                }
            }

            for (int j = i + 1; j < n; j++) {
                if (heights[j] <= heights[j - 1]) {
                    currentWatered++;
                } else {
                    break; 
                }
            }

            if (currentWatered > maxWatered) {
                maxWatered = currentWatered;
            }
        }

        System.out.println(maxWatered);
        sc.close();
    }
}