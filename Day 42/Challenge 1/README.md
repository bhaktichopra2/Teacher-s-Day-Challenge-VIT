# Find the Maximum Achievable Number

Java implementation for Leetcode 2769 — Find the Maximum Achievable Number.

---

## Problem Statement

Given two integers, `num` and `t`, return the maximum achievable value of `x` that can become equal to `num` after applying the following operation at most `t` times:
- Increase or decrease both `x` and `num` by 1 in each operation.

Find and return the largest possible value for `x`.

---

## Input Format

- `num`: Integer, the starting value.
- `t`:  Integer, the number of allowed operations.

---

## Output Format

- Print one integer: the maximum achievable value of `x`.

---

## Approach

- Every operation allows increasing `x` and decreasing `num` (or vice versa), effectively widening the gap by 2.
- The largest possible `x` after all operations is given by:  
  **`x = num + 2 * t`**
- This is a direct formula derived from the problem constraints.

**Complexity:**  
- Time: O(1)  
- Space: O(1)

