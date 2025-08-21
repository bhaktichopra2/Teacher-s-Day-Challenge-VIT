from typing import List

class Solution:
    def numberGame(self, nums: List[int]) -> List[int]:
        # Step 1: Sort the array
        nums.sort()
        # Step 2: Swap adjacent elements
        for i in range(0, len(nums), 2):
            nums[i], nums[i+1] = nums[i+1], nums[i]
        # Step 3: Return the modified array
        return nums

if __name__ == "__main__":
    solution = Solution()
    input_nums = [5, 4, 2, 3]
    result = solution.numberGame(input_nums)
    print("Output:", result)
