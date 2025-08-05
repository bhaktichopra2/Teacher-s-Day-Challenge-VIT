# Maximum Subarray Sum 

## Problem Statement

Given an integer array `nums`, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

## Approach

This solution uses **Kadane’s Algorithm**:
1. Initialize two variables:  
   - `current` for the current subarray sum (starts as `nums[0]`).
   - `max` for the best sum found so far (also starts as `nums[0]`).
2. For each element from the second onward:
   - Update `current` as `max(nums[i], current + nums[i])` — either extend the existing subarray or start a new subarray at `i`.
   - Update `max` if `current` is greater than `max`.
3. Return `max` at the end.
- **Time Complexity:** O(n), single pass through the array.
