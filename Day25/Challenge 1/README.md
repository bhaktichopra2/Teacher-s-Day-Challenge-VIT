# Minimum Number Game 

A simple Java program to solve the "Number Game" problem where you sort an array of integers, then swap every pair of adjacent elements.

---

## Problem Statement

Given an array of integers, perform the following steps:

1. **Sort** the array in non-decreasing order.
2. **Swap** every pair of adjacent elements (i.e., swap elements at index 0 and 1, 2 and 3, etc.).
3. **Return** the modified array.

---

## Approach

- Sort the provided array using `Arrays.sort()`.
- Iterate over the array with a step of 2 and swap elements at index `i` and `i+1`.
- Return the modified array after all swaps.

**Time Complexity:**  
- Sorting: O(n log n)
- Swapping: O(n/2) ≈ O(n)
