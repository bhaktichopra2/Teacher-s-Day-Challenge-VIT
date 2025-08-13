import java.util.Arrays;
import java.util.Scanner;

public class SortedSquares {
    public static int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] list = new int[n];

        for (int i = 0; i < n; i++) {
            list[i] = nums[i] * nums[i];
        }

        Arrays.sort(list);
        return list;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take array size
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] nums = new int[n];

        // Take array input
        System.out.println("Enter the numbers (sorted or unsorted, can be negative):");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        sc.close();

        // Call method and print result
        int[] result = sortedSquares(nums);
        System.out.println("Sorted squares: " + Arrays.toString(result));
    }
}
