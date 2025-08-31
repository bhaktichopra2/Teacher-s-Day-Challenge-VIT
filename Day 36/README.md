# XOR Operation in an Array

Java solution for calculating the bitwise XOR of a custom array defined by given formula parameters.

---

## Problem Statement

Given two integers, `n` and `start`, define an array `nums` where:
- `nums[i] = start + 2 * i` for `i` from `0` to `n-1`
- Compute the bitwise XOR of all elements in `nums`.

Return the result as an integer.

---

## Input Format

- Two integers: `n` (number of elements) and `start` (initial value).
- The input values should be assigned in the main method or read as preferred.

---

## Output Format

- Print one integer: the XOR of all elements of `nums`.

---

## Approach

- Initialize `result` as 0.
- Loop from `0` to `n-1`, for each index compute `start + 2 * i`, then apply bitwise XOR to accumulate the result.
- Return the final computed value.

**Complexity:**  
- Time: O(n)  
- Space: O(1)  

