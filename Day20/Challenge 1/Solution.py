from typing import List
import collections

def sortedSquares(nums: List[int]) -> List[int]:
    ans = collections.deque()
    l, r = 0, len(nums) - 1

    while l <= r:
        left, right = abs(nums[l]), abs(nums[r])
        if left > right:
            ans.appendleft(left * left)
            l += 1
        else:
            ans.appendleft(right * right)
            r -= 1
    return list(ans)

if __name__ == "__main__":
    # Example run
    n = int(input("Enter the number of elements: "))
    nums = [int(input(f"Element {i+1}: ")) for i in range(n)]

    result = sortedSquares(nums)
    print("Sorted squares:", result)
