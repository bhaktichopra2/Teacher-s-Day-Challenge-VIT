# Add Digits (Java Implementation)

This project demonstrates the solution for the "Add Digits" problem using Java.  
The function repeatedly adds the digits of a number until only a single-digit result remains.

---

## Problem Description

Given an integer `num`, repeatedly add all its digits until the result has only one digit, and return it.

### Examples

- Input: `38` → `3 + 8 = 11` → `1 + 1 = 2` → Output: `2`
- Input: `0` → Output: `0`
- Input: `99` → `9 + 9 = 18` → `1 + 8 = 9` → Output: `9`

---

## Approach

We use the **digital root** formula instead of looping:

- If `num == 0`, return `0`.
- If `num % 9 == 0`, return `9`.
- Otherwise, return `num % 9`.

This reduces the time complexity to **O(1)**.

