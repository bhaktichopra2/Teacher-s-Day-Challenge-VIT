public class Solution{
    public String triangleType(int[] nums) {
        int a = nums[0];
        int b = nums[1];
        int c = nums[2];

        if (a + b <= c || a + c <= b || b + c <= a) {
            return "none";
        }
        if (a == b && b == c) {
            return "equilateral";
        } else if (a == b || b == c || a == c) {
            return "isosceles";
        } else {
            return "scalene";
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        // Example usage:
        int[] nums = {3, 3, 3};
        System.out.println("Triangle type: " + sol.triangleType(nums)); // Output: equilateral

        int[] nums2 = {5, 5, 8};
        System.out.println("Triangle type: " + sol.triangleType(nums2)); // Output: isosceles

        int[] nums3 = {2, 3, 4};
        System.out.println("Triangle type: " + sol.triangleType(nums3)); // Output: scalene

        int[] nums4 = {1, 2, 3};
        System.out.println("Triangle type: " + sol.triangleType(nums4)); // Output: none
    }
}
