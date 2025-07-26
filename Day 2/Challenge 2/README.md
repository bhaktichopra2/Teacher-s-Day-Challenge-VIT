# Two Sum

## Problem Statement

Given an array of integers `nums` and an integer `target`, return **indices of the two numbers** such that they add up to `target`.

- **You may assume that each input would have exactly one solution**, and you may not use the **same element twice**.
- You can return the answer in any order.

[Problem Link - LeetCode 1. Two Sum](https://leetcode.com/problems/two-sum/)

### Example

Input: nums = , target = 9
Output:
Explanation: nums + nums == 9, so return .

## Approach

1. **Hash Map idea:**  
   - Iterate over the array, and for each number, calculate the complement (`target - nums[i]`).
   - If the complement exists in the map (meaning we've seen it before), return both indices.
   - Otherwise, store the current number and its index in the map for future reference.

2. **Efficiency:**  
   - This approach avoids nested loops, achieving **O(n)** time complexity and **O(n)** space complexity.
