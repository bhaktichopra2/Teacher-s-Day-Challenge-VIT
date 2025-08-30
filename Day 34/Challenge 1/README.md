# Sum of Multiples of 3, 5, or 7

A Java program to compute the sum of all numbers from 0 to `n` (inclusive) that are multiples of 3, 5, or 7.

---

## Problem Statement

Given an integer `n`, calculate the sum of all numbers in the range `[0, n]` that are divisible by 3, 5, or 7.

---

## Example

**Input:**  
`n = 10`

**Output:**  
`40`

**Explanation:**  
Multiples of 3, 5, or 7 in the range `[0, 10]` are: 0, 3, 5, 6, 7, 9, 10  
Sum = 0 + 3 + 5 + 6 + 7 + 9 + 10 = 40

---

## Approach

- Loop through all numbers from 0 to `n`.
- For each number, check divisibility by 3, 5, or 7.
- If divisible, add to total sum.

**Complexity:**  
- Time: O(n)
- Space: O(1)

