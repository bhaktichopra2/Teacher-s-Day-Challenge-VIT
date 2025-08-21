# Number of Good Pairs

## Problem Statement

Given an integer array `nums`, return the number of **good pairs**.

A pair `(i, j)` is called **good** if:

- `nums[i] == nums[j]`
- `i < j`

---

## Approach: Brute Force (Nested Loops)

- Use two nested loops to iterate over all pairs `(i, j)` such that `i < j`.
- For each pair, check if `nums[i] == nums[j]`.
- If yes, increment the count of good pairs.
- Return the total count at the end.

### Time Complexity

- **O(n²)**, where *n* is the size of the input array.
- This is because for each element, you potentially compare it with all subsequent elements.
