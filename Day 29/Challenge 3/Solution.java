import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] heights = new int[n];

        int maxHeight = 0;
        int minHeight = 101;
        int maxIndex = -1;
        int minIndex = -1;

        for (int i = 0; i < n; i++) {
            heights[i] = sc.nextInt();
            
            if (heights[i] > maxHeight) {
                maxHeight = heights[i];
                maxIndex = i;
            }

            if (heights[i] <= minHeight) {
                minHeight = heights[i];
                minIndex = i;
            }
        }
        
        int swaps = maxIndex + (n - 1 - minIndex);

        if (maxIndex > minIndex) {
            swaps--;
        }
        System.out.println(swaps);
        
        sc.close();
    }
}

